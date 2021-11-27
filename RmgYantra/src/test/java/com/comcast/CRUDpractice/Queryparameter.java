package com.comcast.CRUDpractice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Queryparameter
{
	@Test
	public void queryparameter()
	{
	     given()
	     .queryParam("page", 1)
	     .when()
	     .get("https://reqres.in/api/users")
	     .then().log().all();
	}

}
