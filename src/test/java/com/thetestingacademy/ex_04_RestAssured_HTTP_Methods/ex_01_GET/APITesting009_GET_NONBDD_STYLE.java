package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.ex_01_GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_GET_NONBDD_STYLE {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;



    @Test
    public void test_GET_NON_BDD_STYLE(){

        pincode = "560049";
        // DIVIDE YOUR PROGRAM INTO 3 PARTS
        // GIVEN - PART 1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);


        //  When - Part 2
        response = r.when().log().all().get();
        System.out.println(response.asString());


        // Then - Part 3 - validation
        vr = response.then().log().all();
        vr.statusCode(200);
        // Write the further testcases or assertions also here.






    }
}
