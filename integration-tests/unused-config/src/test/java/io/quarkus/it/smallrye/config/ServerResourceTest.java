package io.quarkus.it.smallrye.config;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class ServerResourceTest {

    @Test
    void mapping() {
        given()
                .get("/config")
                .then()
                .statusCode(500);
    }

}
