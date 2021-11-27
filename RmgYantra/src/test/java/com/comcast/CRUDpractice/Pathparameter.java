package com.comcast.CRUDpractice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Pathparameter 
{
	@Test
	public void pathparameter()
	{
		given()
		.pathParams("projectId","TY_PROJ_004")
		.when()
		.get("http://localhost:8084/projects/{projectId}")
		.then()
		.log().all();
	}

}
