package nonBDD;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class RestAssuredExtension {

	public static RequestSpecification Request;
	
	public RestAssuredExtension() {
		//Arrange
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://localhost:3000/posts");
		builder.setContentType(ContentType.JSON);
		RequestSpecification requestSpec = builder.build();
		Request = RestAssured.given().spec(requestSpec);
	}
	
	public static void GetOpsWithPathParameter(String url, Map<String, String> pathParams) throws URISyntaxException {
		// Act
		Request.pathParams((java.util.Map<String, ?>) pathParams);
		Request.get(new URI(url));
	}
	
	public static ResponseOptions<Response> GetOps(String url) {
		// Act
		return Request.get(url);  
	}
	
	public static ResponseOptions<Response> PostOpsWithBodyAndPathParams(String url, Map<String, String> pathParams, Map<String, String> body){
		
		Request.pathParams(pathParams);
		Request.body(body);
		return Request.post(url);
	}
	
}
