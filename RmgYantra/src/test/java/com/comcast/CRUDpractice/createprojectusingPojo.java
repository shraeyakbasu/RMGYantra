package com.comcast.CRUDpractice;

import org.testng.annotations.Test;

import com.comcast.GenericUtils.Endpoints;
import com.comcast.PojoClass.ProjectPojo;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class createprojectusingPojo
{

	@Test
	public void createprojectwithPojo()
	{
		baseURI="http://localhost";
		port=8084;
		ProjectPojo pojo=new ProjectPojo("shraeyak","facebook","completed",40);
		
		given()
		.contentType(ContentType.JSON)
		.body(pojo)
		.when()
		.post(Endpoints.post)
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
				
	}
}
