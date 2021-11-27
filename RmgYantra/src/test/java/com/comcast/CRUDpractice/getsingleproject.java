package com.comcast.CRUDpractice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class getsingleproject
{
	@Test
	public void getsingleproject()
	{
		
		when()
		.get("http://localhost:8084/projects/TY_PROJ_005")
		.then()
		.assertThat().statusCode(200) // if success will get 200 else 500 
		.log().all();
		
	}

}
