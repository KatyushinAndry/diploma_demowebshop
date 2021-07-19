package cloud.autotests.request;

import cloud.autotests.config.demowebshop.AppConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.aeonbits.owner.ConfigFactory;

public class Specification {

    static AppConfig appConfig = ConfigFactory.create(
            AppConfig.class, System.getProperties());

    public static RequestSpecification getRequestSpecification(){
        return new RequestSpecBuilder()
                .setBaseUri(appConfig.apiUrl())
                .setContentType(ContentType.URLENC)
                .log(LogDetail.ALL)
                .build();
    }

    public static ResponseSpecification getResponseSpecification(){
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }

}
