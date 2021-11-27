package com.comcast.CRUDpractice;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class createprojectusinghashmap
{
	@Test
	public void createproject()
	{
		
		HashMap map=new HashMap<>();
		map.put("createdBy", "mrs.das");
		map.put("projectName", "microsoft");
		map.put("status", "on going");
		map.put("teamSize", "5");
		
		given()
		.contentType(ContentType.JSON)
		.body(map)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.statusCode(201)
		.log().all();
	}

}
