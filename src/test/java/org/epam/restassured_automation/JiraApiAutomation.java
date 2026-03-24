package org.epam.restassured_automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.*;

public class JiraApiAutomation {

    static String issueKey;

    public static void main(String[] args) {

        RestAssured.baseURI = "https://your-domain.atlassian.net";

        createDefect();
        updateDefect();
        searchDefect();
        addAttachment();
        deleteDefect();
        createDefectWithAttachment();
    }

    // 1 CREATE DEFECT
    public static void createDefect() {

        String body = "{\n" +
                " \"fields\": {\n" +
                "   \"project\": {\"key\": \"TEST\"},\n" +
                "   \"summary\": \"API Created Bug\",\n" +
                "   \"description\": \"Bug created using RestAssured\",\n" +
                "   \"issuetype\": {\"name\": \"Bug\"}\n" +
                " }\n" +
                "}";

        Response response =
                given()
                        .auth().preemptive()
                        .basic("mohanapriya_mathiyalagan@epam.com", "TOkpyMeHi1WcDC7pNbLxL41oOOmrw0aCCK0Wuf")
                        .header("Content-Type", "application/json")
                        .body(body)
                        .when()
                        .post("/rest/api/3/issue");

        issueKey = response.jsonPath().getString("key");

        System.out.println("Created Issue: " + issueKey);
    }

    // 2 UPDATE DEFECT
    public static void updateDefect() {

        String updateBody = "{\n" +
                " \"fields\": {\n" +
                "   \"summary\": \"Updated Bug Summary\"\n" +
                " }\n" +
                "}";

        given()
                .auth().preemptive()
                .basic("email@example.com", "api_token")
                .header("Content-Type", "application/json")
                .body(updateBody)
                .when()
                .put("/rest/api/3/issue/" + issueKey)
                .then()
                .statusCode(204);

        System.out.println("Issue Updated");
    }

    // 3 SEARCH DEFECT
    public static void searchDefect() {

        Response response =
                given()
                        .auth().preemptive()
                        .basic("email@example.com", "api_token")
                        .queryParam("jql", "key=" + issueKey)
                        .when()
                        .get("/rest/api/3/search");

        System.out.println("Search Result:");
        System.out.println(response.getBody().asPrettyString());
    }

    // 4 ADD ATTACHMENT
    public static void addAttachment() {

        given()
                .auth().preemptive()
                .basic("email@example.com", "api_token")
                .header("X-Atlassian-Token", "no-check")
                .multiPart("file", new File("bug.png"))
                .when()
                .post("/rest/api/3/issue/" + issueKey + "/attachments")
                .then()
                .statusCode(200);

        System.out.println("Attachment Added");
    }

    // 5 DELETE DEFECT
    public static void deleteDefect() {

        given()
                .auth().preemptive()
                .basic("email@example.com", "api_token")
                .when()
                .delete("/rest/api/3/issue/" + issueKey)
                .then()
                .statusCode(204);

        System.out.println("Issue Deleted");
    }

    // 6 CREATE DEFECT WITH ATTACHMENT
    public static void createDefectWithAttachment() {

        String body = "{\n" +
                " \"fields\": {\n" +
                "   \"project\": {\"key\": \"TEST\"},\n" +
                "   \"summary\": \"Bug with Attachment\",\n" +
                "   \"description\": \"Created via RestAssured\",\n" +
                "   \"issuetype\": {\"name\": \"Bug\"}\n" +
                " }\n" +
                "}";

        Response response =
                given()
                        .auth().preemptive()
                        .basic("email@example.com", "api_token")
                        .header("Content-Type", "application/json")
                        .body(body)
                        .when()
                        .post("/rest/api/3/issue");

        String newIssue = response.jsonPath().getString("key");

        given()
                .auth().preemptive()
                .basic("email@example.com", "api_token")
                .header("X-Atlassian-Token", "no-check")
                .multiPart("file", new File("bug.png"))
                .when()
                .post("/rest/api/3/issue/" + newIssue + "/attachments");

        System.out.println("Created Issue with Attachment: " + newIssue);
    }
}