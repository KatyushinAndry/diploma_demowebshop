package cloud.autotests.request;

import cloud.autotests.config.demowebshop.AppConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;

public class AuthRequest {
    static AppConfig appConfig = ConfigFactory.create
            (AppConfig.class, System.getProperties());

    public static String authorization(){

        return given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("Email", appConfig.userLogin())
                .formParam("Password", appConfig.userPassword())
                .when()
                .post("http://demowebshop.tricentis.com/login")
                .then()
                .statusCode(302)
                .log().body()
                .extract()
                .cookie("NOPCOMMERCE.AUTH");


    }


}
