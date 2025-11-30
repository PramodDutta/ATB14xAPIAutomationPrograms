package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.ex_01_GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting008_GET_BDDStyle {

    @Test
    public void test_GET_POSITIVE(){
        String pincode = "560058";
        pincode = "110048";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }


}
