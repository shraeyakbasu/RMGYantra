package com.comcast.CRUDpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class createproject
{
	@Test
	public void createproject()
	{
		JSONObject obj=new JSONObject();         //if created will get 201
		obj.put("createdBy", "bill gates");
		obj.put("createdOn", "25/05/2021");
		obj.put("projectId", "TY_PROJ_451");
		obj.put("projectName", "samsung mobile");
		obj.put("status", "on going");
		obj.put("teamSize", "5");
		
		given()
		.contentType(ContentType.JSON)
		.and()
		.body(obj)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();                  
		
		
	}

}
