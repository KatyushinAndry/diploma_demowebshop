package cloud.autotests.tests.autorization;

import cloud.autotests.annotations.AutoMember;
import cloud.autotests.annotations.Component;
import cloud.autotests.annotations.JiraIssue;
import cloud.autotests.annotations.ManualMember;
import cloud.autotests.listener.TestListener;
import cloud.autotests.pages.MainPages;
import cloud.autotests.tests.TestBase;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.Cookie;

import static cloud.autotests.request.AuthRequest.authorization;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.qameta.allure.Allure.step;

@ExtendWith(TestListener.class)
public class TestAutorization extends TestBase {
    MainPages mainPages = new MainPages();

    @AllureId("3650")
    @Tags({@Tag("critical"), @Tag("api")})
    @JiraIssue("QC5-8")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("API")
    @Test
    @DisplayName("AUTHORIZATION via api")
    void testAuthorizationAPI(){

        step("Get cookie by api and set it to browser", () -> {
            String authorizationCookie = authorization();
            step("Open minimal content, because cookie can be set with site opened", () ->
                    open("/Themes/DefaultClean/Content/images/logo.png"));
            getWebDriver().manage().addCookie(new Cookie("NOPCOMMERCE.AUTH", authorizationCookie));
            step("Open main page", () -> {
                open("");
                $(".topic-html-content-header").shouldHave(text("Welcome to our store"));
            });
            step("Verify successful authorization", () ->
                    $(".account").shouldHave(text("a.katyushin@gmail.com")));
        });
    }

    @AllureId("3665")
    @Tags({@Tag("high"), @Tag("UI")})
    @JiraIssue("QC5-8")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Login with incorrect credentials")
    void testLoginIncorrect(){
        step("Open main page", () ->
                open(""));

        step("Login with incorrect credentials", () ->
                mainPages.incorrectLogin());

        step("Check correct error message", () ->
                mainPages.errorMessage("Login was unsuccessful. Please correct the errors and try again.\n" +
                        "The credentials provided are incorrect"));

    }
}
