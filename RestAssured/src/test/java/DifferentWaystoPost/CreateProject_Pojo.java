package DifferentWaystoPost;

import org.testng.annotations.Test;

import com.petstore.POJOClass.PojoReqRes;

import GenericUtilities.EndPoints;
import GenericUtilities.EndPoints1;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject_Pojo {
	
	
	@Test
	public void createProjects()
	{
		PojoReqRes pojo=new PojoReqRes("asia", "Software Engineer");
		
		given()
		.contentType(ContentType.JSON)
		.body(pojo)
		.when()
		.post("https://reqres.in"+EndPoints1.createProj)
	  .then().log().all();
	 
	 
	 
		
		
		
	}
	
	

}
