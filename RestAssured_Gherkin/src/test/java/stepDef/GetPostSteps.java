package stepDef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import nonBDD.RestAssuredExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.List;

public class GetPostSteps {
	
	public static ResponseOptions<Response> response;

	@Given("^I perform GET operation for \"([^\"]*)\"$")
	public void i_perform_GET_operation_for(String url) throws Throwable {
	    response = RestAssuredExtension.GetOps(url);
	}
	
	@Then("^I should see the author name as \"([^\"]*)\"$")
	public void i_should_see_the_author_name_as(String authorName) {
		String author = response.getBody().jsonPath().get("author");
	    assertThat(author, equalTo(authorName));
	}
 
	@Given("^I perform GET operation for the post number \"([^\"]*)\"$")
	public void i_perform_GET_operation_for_the_post_number(String postNumber) throws Throwable {
	    BDDstyleMethod.SimpleGETPost(postNumber);    	
	}

	@Then("^I should see the author names$")
	public void i_should_see_the_author_names() throws Throwable {
		BDDstyleMethod.PerformContainsCollection();
	}

	@Then("^I should verify GET path parameter$")
	public void i_should_verify_GET_path_parameter() throws Throwable {
		BDDstyleMethod.PerformPathParameters();
	}
	
	@Then("^I should verify GET query parameter$")
	public void i_should_verify_GET_query_parameter() throws Throwable {
		BDDstyleMethod.PerformQueryParameters();
	}
	
	@Given("^I perform POST operation for \"([^\"]*)\"$")
	public void i_perform_POST_operation_for(String arg1) throws Throwable {
	    BDDstyleMethod.PerformPostWithBodyParameter();
	}
	
	@Given("^I perform POST operation for \"([^\"]*)\" with body$")
	public void i_perform_POST_operation_for_with_body(String url, DataTable table) throws Throwable {
	    
		List<List<String>> data = table.raw();
		
		//set body
		HashMap<String, String> body = new HashMap<>();
		body.put("name",data.get(1).get(0));
		
		// Path Params
		HashMap<String, String> pathParams = new HashMap<>();
		pathParams.put("profileNo",data.get(1).get(1));
		
		// Perform post opearation
		response  = RestAssuredExtension.PostOpsWithBodyAndPathParams(url, pathParams, body);
			
	}

	@Then("^I should see body has name as \"([^\"]*)\"$")
	public void i_should_see_body_has_name_as(String name) throws Throwable {
	   String nameValue = response.getBody().jsonPath().get("name");
	   assertThat(nameValue, equalTo(name)); 
	}

}
