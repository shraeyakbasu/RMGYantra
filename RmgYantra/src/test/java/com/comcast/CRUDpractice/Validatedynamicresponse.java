package com.comcast.CRUDpractice;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class Validatedynamicresponse 
{
	@Test
	public void validatedynamicresponse()
	{
		String expprojectid="TY_PROJ_613";
		Response resp=when()
		.get("http://localhost:8084/projects");
		
		List<String> pids=resp.jsonPath().get("projectId");
		
		for(String str : pids)
		{
			if(str.equalsIgnoreCase(expprojectid))
			{
				System.out.println("expected project found "+expprojectid);
				break;
			}
		}
		
		resp.then()
		.log().all();
		
		
	}

}
