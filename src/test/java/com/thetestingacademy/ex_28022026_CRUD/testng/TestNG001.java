package com.thetestingacademy.ex_28022026_CRUD.testng;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestNG001 {
    @Test
    public void testng_get(){
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/400001")
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }

}
