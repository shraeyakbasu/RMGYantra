package com.comcast.CRUDpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.GenericUtils.Endpoints;
import com.comcast.PojoClass.ProjectPojo;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class createmultipleprojectusingPojo 
{
	
	@Test(dataProvider = "provideData")
	public void createmultipleprojects(String createdBy,String projectName,String status,int teamSize)
	{
		baseURI ="http://localhost";
		port=8084;
		ProjectPojo pojo=new ProjectPojo(createdBy, projectName, status, teamSize);
		given()
		.contentType(ContentType.JSON)
		.body(pojo)
		.when()
		.post(Endpoints.post)
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
	
	
	
	@DataProvider
	public Object[][] provideData()
	{
		Object[][] obj=new Object[5][4];
		
		obj[0][0]="saurav";
		obj[0][1]="hdfc";
		obj[0][2]="on going";
		obj[0][3]=4;
		
		obj[1][0]="sachin";
		obj[1][1]="icici";
		obj[1][2]="on going";
		obj[1][3]=7;
		
		obj[2][0]="dravid";
		obj[2][1]="canara";
		obj[2][2]="on going";
		obj[2][3]=4;
		
		obj[3][0]="kohli";
		obj[3][1]="sbi";
		obj[3][2]="completed";
		obj[3][3]=10;
		
		obj[4][0]="dhoni";
		obj[4][1]="yes bank";
		obj[4][2]="on going";
		obj[4][3]=15;
		
		return obj;
	}

}
