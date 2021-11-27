package com.comcast.CRUDpractice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class HeaderAuthentication
{

	@Test
	public void headerauthentication()
	{
		
		when()
		.get("http://localhost:5555/projects")
		.then()
		.log().all()
		.assertThat().header("Transfer-Encoding", "chunked")
		.and()
		.assertThat().header("X-Frame-Options", "DENY")
		.assertThat().statusCode(200);
		
	}
}
