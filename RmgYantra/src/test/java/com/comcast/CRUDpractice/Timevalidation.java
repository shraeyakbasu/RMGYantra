package com.comcast.CRUDpractice;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class Timevalidation 
{
	@Test
	public void timevalidation()
	{
	

	when()
	.get("http://localhost:5555/projects")
	.then()
	.assertThat().time(Matchers.lessThanOrEqualTo(5000L),TimeUnit.SECONDS)
	.log().all();
	}

}
