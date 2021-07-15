package cloud.autotests.tests;

import cloud.autotests.annotations.AutoMember;
import cloud.autotests.annotations.Component;
import cloud.autotests.annotations.JiraIssue;
import cloud.autotests.annotations.ManualMember;
import cloud.autotests.listener.TestListener;
import cloud.autotests.model.AddToCartResponse;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.Cookie;

import static cloud.autotests.data.TestData.giftCard;
import static cloud.autotests.data.TestData.simpleComputer;
import static cloud.autotests.request.AuthRequest.authorization;
import static cloud.autotests.request.Request.post;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


@ExtendWith(TestListener.class)
public class ProjectTestsAPI extends TestBase {

    public String
            cookie,
            cookieAuth;
    public AddToCartResponse
            response,
            responseAuth;

    //@JiraIssues({@JiraIssue("QC5-5")})
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

        });
    }

    //@JiraIssues({@JiraIssue("QC5-5")})
    @AllureId("3651")
    @Tags({@Tag("critical"), @Tag("api")})
    @JiraIssue("QC5-8")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("API+UI")
    @Test
    @DisplayName("Add product to cart via api and check from UI without AUTHORIZATION")
    void testAddProductToCardWithoutAuthorization(){
        step("Open main page", () ->
                open(""));

            step("Check that the shopping cart is empty", () ->
                    $("#topcartlink .cart-qty").shouldBe(text("(0)")));

                step("Get cookie from ui webDriver", () ->
                        cookie = getWebDriver().manage().getCookieNamed("Nop.customer").getValue());

                    step("Add product to cart via api", () ->
                            response = post("/addproducttocart/details/72/1",
                                    simpleComputer, 200, "Nop.customer", cookie)
                                    .as(AddToCartResponse.class));
                    sleep(5000);

                        step("Check that the product is added via api", () -> {
                            assertThat(response.isSuccess(), is(true));
                            assertThat(response.getUpdatetopcartsectionhtml(), is("(1)"));
                        });

                            step("Check that the product is added via ui", () -> {
                                open("");
                                $("#topcartlink .cart-qty").shouldBe(text("(1)"));
                            });
    }

    @AllureId("3652")
    @Tags({@Tag("critical"), @Tag("api")})
    @JiraIssue("QC5-8")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("API+UI")
    @Test
    @DisplayName("Add product to cart via api and check from UI with AUTHORIZATION")
    void testAddProductToCardWithAuthorization(){

        step("Get cookie by api and set it to browser", () -> {

            String authorizationCookie = authorization();

            step("Open minimal content, because cookie can be set with site opened", () ->
                    open("/Themes/DefaultClean/Content/images/logo.png"));

            getWebDriver().manage().addCookie(new Cookie("NOPCOMMERCE.AUTH", authorizationCookie));

        });

        step("Open main page", () -> {
            open("");
            $(".topic-html-content-header").shouldHave(text("Welcome to our store"));
        });

        step("Verify successful authorization", () ->
                $(".account").shouldHave(text("a.katyushin@gmail.com")));


        step("Check that the shopping cart is empty", () ->
                $("#topcartlink .cart-qty").shouldBe(text("(0)")));

        step("Get cookie from ui webDriver", () ->
                cookieAuth = getWebDriver().manage().getCookieNamed("Nop.customer").getValue());

        step("Add product to cart via api", () ->

                responseAuth = post("/addproducttocart/details/2/1",
                        giftCard, 200, "Nop.customer", cookieAuth)
                        .as(AddToCartResponse.class));

        step("Check that the product is added via api", () -> {
            assertThat(responseAuth.isSuccess(), is(true));
            assertThat(responseAuth.getMessage(), is("The product has been added to your <a href=\"/cart\">shopping cart</a>"));
            assertThat(responseAuth.getUpdatetopcartsectionhtml(), is("(1)"));

        });

//        step("Check that the product is added via ui", () -> {
//            open("");
//            $("#topcartlink .cart-qty").shouldBe(text("(1)"));
//        });
    }

}