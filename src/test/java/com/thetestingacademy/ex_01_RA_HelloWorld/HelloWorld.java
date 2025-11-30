package com.thetestingacademy.ex_01_RA_HelloWorld;

import io.restassured.RestAssured;

public class HelloWorld {
    public static void main(String[] args) {
        RestAssured
                .given().baseUri("https://google.com").log().all()
                .when().get()
                .then().statusCode(200).log().all();
    }
}
