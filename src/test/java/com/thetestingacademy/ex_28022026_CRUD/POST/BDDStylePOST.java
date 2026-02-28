package com.thetestingacademy.ex_28022026_CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class BDDStylePOST {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;

    // POST Request
    // URL - https://restful-booker.herokuapp.com/auth
    // BODY - PAYLOAD - JSON
    // {
    //    "username" : "admin",
    //    "password" : "password123"
    //}
    // HEADER - Content Type -> application/json
    @Test
    public  void test_bddPOST() {
        String payloadPOST= "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";
        requestSpecification=RestAssured.given();
                requestSpecification.baseUri("https://restful-booker.herokuapp.com");
                        requestSpecification.basePath("/auth");
                requestSpecification.contentType(ContentType.JSON).log().all();
                        requestSpecification.body(payloadPOST).log().all();



                Response response=requestSpecification.when().post();
validatableResponse=response.then().log().all();
        validatableResponse.statusCode(200);






    }



    }

