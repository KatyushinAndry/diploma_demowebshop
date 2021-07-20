package cloud.autotests.tests.WishList;

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

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@ExtendWith(TestListener.class)
public class TestWishList extends TestBase {
    MainPages mainPages = new MainPages();

    @AllureId("3667")
    @Tags({@Tag("high"), @Tag("UI")})
    @JiraIssue("QC5-8")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check that the Wishlist was empty by default")
    void testEmptyWhiteList(){
        step("Open main page", () ->
                open(""));

        step("Go to the Wishlist", () ->
                mainPages.opensHeaderTabs("Wishlist"));

        step("Check that the Wishlist was empty by default", () ->
                mainPages.validationMessage(".wishlist-content", "The wishlist is empty!\n"));
    }
}
