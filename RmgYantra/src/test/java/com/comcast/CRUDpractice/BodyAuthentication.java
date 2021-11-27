package com.comcast.CRUDpractice;

import static io.restassured.RestAssured.when;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class BodyAuthentication 
{
	@Test
	public void bodyauthentication()
	{
		when()
		.get("http://localhost:5555/projects")
		.then()
		.log().all()
		.assertThat().body("[2].projectId", Matchers.containsString("TY_PROJ_1002"))
		.and()
		.assertThat().body("projectName", Matchers.hasItems("microsoft","sony","facebook","yes bank"))
		.assertThat().body("[2].createdOn", Matchers.containsString("29/05/2021"))
		.assertThat().statusCode(200);
	}

}
