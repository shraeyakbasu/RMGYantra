package com.comcast.CRUDpractice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Validateastaticresponse 
{
	@Test
	public void validatestaticresponse()
	{
		String expprojectid="TY_PROJ_004";
		
		Response rest=when()
		.get("http://localhost:8084/projects");
		
		String actualprojectid=rest.jsonPath().get("[0].projectId");
		System.out.println(actualprojectid);
		
		rest.then()
		.log().all();
		Assert.assertEquals(actualprojectid, expprojectid);
		
		
		
		
	}

}
