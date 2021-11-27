package com.comcast.CRUDpractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class getallprojects 
{
	@Test
	public void getallprojects()
	{
		Response rest=RestAssured.get("http://localhost:8084/projects");
		//System.out.println(rest.asString());
		
		System.out.println(rest.prettyPrint());
		System.out.println(rest.statusCode()); // if successful will get 200
		
		
	}

}
