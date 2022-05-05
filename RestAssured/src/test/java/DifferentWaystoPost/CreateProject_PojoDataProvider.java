package DifferentWaystoPost;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.petstore.POJOClass.PojoReqRes;

import GenericUtilities.EndPoints1;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject_PojoDataProvider {
	
	
	@Test(dataProvider="provideData")
	
	public void  pojoTest(String name,String job )
	{
		PojoReqRes pojo=new PojoReqRes(name,job);
		
		given()
		.contentType(ContentType.JSON)
		.body(pojo)
		.when()
		.post("https://reqres.in"+EndPoints1.createProj)
		.then().log().all();
		
		
		
		
	}
	
	
	@DataProvider()
	
	public Object[][] provideData()
	{
		Object[][] obj=new Object[2][2];
		
		
		obj[0][0]="A";
		obj[0][1]="B";
		
		
		obj[1][0]="C";
		obj[1][1]="D";
		
		
		return obj;
				
	
	}
	
	
	
	

}
