package com.comcast.CRUDpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class updateproject 
{
	@Test
	public void updateproject()
	{
		JSONObject obj=new JSONObject();                // if successful will get 200 else 404 
		obj.put("createdBy", "shraeyak basu");
		obj.put("createdOn", "25/05/2021");
		obj.put("projectId", "TY_PROJ_402");
		obj.put("projectName", "samsung mobile");
		obj.put("status", "completed");
		obj.put("teamSize", "7");
		
		given()
		.body(obj)
		.and()
		.contentType(ContentType.JSON)
		.when()
		.put("http://localhost:8084/projects/TY_PROJ_204")
		.then()
		.statusCode(200)
		.log().all();
		
	}

}
