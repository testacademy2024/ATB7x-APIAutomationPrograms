package com.thetestingacademy.ex_28022026_CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NonBDDStylePOST {
    static RequestSpecification r= RestAssured.given();
    public static void main(String[] args) {
        String payload= "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all().body(payload);
                r.when().log().all().post();
                r.then().log().all().statusCode(200);

        Response response=r.when().post();

        //Validatable Response
        ValidatableResponse validatableResponse=response.then().log().all().statusCode(200);


    }
}
