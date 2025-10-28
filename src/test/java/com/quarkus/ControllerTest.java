package com.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class ControllerTest {

    @Test
    public void test() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello world!"));
    }

    @Test
    public void testTempEndpoint_whenTestIdIs1_returnsShiva() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .post("/test/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo("Shiva"));
    }

    @Test
    public void testTempEndpoint_whenTestIdIsNot1_returnsSai() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .post("/test/5")
                .then()
                .statusCode(200)
                .body("id", equalTo(2))
                .body("name", equalTo("Sai"));
    }
}
