package com.thetestingacademy.ex_28022026_CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
//RestAssured provides us with lot of classes
//        r.useRelaxedHTTPSValidation("TLS""); - HTTPs related issued
public class NonBDDStyle {
    static RequestSpecification r= RestAssured.given();

    public static void main(String[] args) {
        r.baseUri("https://api.zippopotam.us");


   test_non_bdd1();
   test_non_bdd2();
    }

    private static void test_non_bdd2() {
        r.basePath("/IN/-1");
        r.when().log().all().get();
        r.then().log().all().statusCode(404);
    }

    private static void test_non_bdd1() {

        r.basePath("/IN/400001");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }
}
