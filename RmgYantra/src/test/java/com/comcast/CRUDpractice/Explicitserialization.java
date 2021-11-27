package com.comcast.CRUDpractice;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import com.comcast.GenericUtils.Endpoints;
import com.comcast.PojoClass.ProjectPojo;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

public class Explicitserialization 
{
	@Test
	public void explicitserialization()
	{
		baseURI="http://localhost";
		port=5555;
		ProjectPojo pojo=new ProjectPojo("shraeyak","facebook","completed",40);
		
		given()
		.contentType(ContentType.JSON)
		.body(pojo,ObjectMapperType.JACKSON_1)
		.when()
		.post(Endpoints.post)
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

}
