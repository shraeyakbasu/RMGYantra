package com.comcast.CRUDpractice;

import java.io.File;

import org.testng.annotations.Test;

import com.comcast.GenericUtils.AutoConstant;
import com.comcast.GenericUtils.Endpoints;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class createprojectusingjsonfile 
{
	@Test
	public void createproject()
	{
		baseURI="http://localhost";
		port=8084;
		
		File newfile=new File(AutoConstant.jsonpath);
		
		given()
		.contentType(ContentType.JSON)
		.body(newfile)
		.when()
		.post(Endpoints.post)
		.then()
		.log().all();
	}

}
