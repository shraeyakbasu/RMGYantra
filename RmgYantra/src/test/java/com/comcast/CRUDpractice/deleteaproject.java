package com.comcast.CRUDpractice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class deleteaproject 
{
	@Test
	public void createproject()
	{
		
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_003")
		.then()
		.assertThat().statusCode(204) // if successful 204 will get else 500
		.log().all();
	
		
	}

}
