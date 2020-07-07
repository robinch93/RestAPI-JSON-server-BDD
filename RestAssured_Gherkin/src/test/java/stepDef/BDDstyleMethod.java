package stepDef;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.hamcrest.core.Is;

import io.restassured.http.ContentType;

public class BDDstyleMethod {

	public static void SimpleGETPost(String postNumber) {
		given().contentType(ContentType.JSON)
			.when().get(String.format("http://localhost:3000/posts/%s", postNumber))
	    	.then().body("author", is("john"));
	}
	
	public static void PerformContainsCollection() {
		given()
			.contentType(ContentType.JSON)
		.when()
			.get("http://localhost:3000/posts/")
		.then()
			.body("author", containsInAnyOrder("john", "cena", "Execute Automation")).statusCode(200);
	}
	
	public static void PerformPathParameters() {
		given()
			.contentType(ContentType.JSON).
		with()
			.pathParam("post", 1).
		when()
			.get("http://localhost:3000/posts/{post}").
		then()
			.body("author", containsString("john"));
	}
	
	public static void PerformQueryParameters() {
		given()
			.contentType(ContentType.JSON)
			.queryParam("id", 2).
		when()
			.get("http://localhost:3000/posts/").
		then()
			.body("author", hasItem("cena"));
	}
	
	public static void PerformPostWithBodyParameter() {
		HashMap<String, String> postContent = new HashMap<String, String>();
		postContent.put("id", "4");
		postContent.put("title", "Robots");
		postContent.put("author", "Automation 4");
		
		given()
			.contentType(ContentType.JSON).
		with()
			.body(postContent).
		when()
			.post("http://localhost:3000/posts").
		then()
			.body("author", Is.is("Automation 4"));
	}
	
}
