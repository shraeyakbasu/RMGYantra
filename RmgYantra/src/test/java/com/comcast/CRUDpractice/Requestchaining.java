package com.comcast.CRUDpractice;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Requestchaining
{
	@Test
	public void requestchaining()
	{
		HashMap map=new HashMap<>();
		map.put("createdBy", "mrs.mallick");
		map.put("projectName", "sony");
		map.put("status", "completed");
		map.put("teamSize", "7");
		
		Response resp=given()
		.contentType(ContentType.JSON)
		.body(map)
		.when()
		.post("http://localhost:8084/addProject");
		
		String projectid=resp.jsonPath().get("projectId");
		System.out.println(projectid);
		
		given()
		.pathParam("projid", projectid)
		.when()
		.get("http://localhost:8084/projects/{projid}")
		.then()
		.log().all();
	}

}
