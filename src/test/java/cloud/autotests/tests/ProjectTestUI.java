package cloud.autotests.tests;

import cloud.autotests.annotations.*;
import cloud.autotests.listener.TestListener;
import cloud.autotests.pages.MainPages;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static cloud.autotests.helpers.DriverUtils.getConsoleLogs;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;

@ExtendWith(TestListener.class)
public class ProjectTestUI extends TestBase {
    MainPages mainPages = new MainPages();

    //@JiraIssues({@JiraIssue("QC5-5")})
    @AllureId("3649")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Console log should not have any errors")
    void consoleLogShouldNotHaveErrors(){
        step("Open main page", () -> open(""));

        step("Page should not have errors (SERVE) in console", () -> {
            String consoleLogs = getConsoleLogs();
            assertThat(consoleLogs, not(containsString("SERVE")));
        });
    }

    //@JiraIssues({@JiraIssue("QC5-5")})
    @AllureId("3653")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Books' item via CATEGORIES ")
    void testOpenedBooksItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Books' item", () ->
                mainPages.opensTabs("Books"));

        step("Check 'Books' item was open", () ->
                mainPages.checkOpenedPage("Home / Books"));

    }
    //@JiraIssues({@JiraIssue("QC5-5")})
    @AllureId("3654")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Computers' item via CATEGORIES ")
    void testOpenedComputersItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Computers' item", () ->
                mainPages.opensTabs("Computers"));

        step("Check 'Computers' item was open", () ->
                mainPages.checkOpenedPage("Home / Computers"));

    }

    @AllureId("3655")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Electronics' item via CATEGORIES ")
    void testOpenedElectronicsItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Electronics' item", () ->
                mainPages.opensTabs("Electronics"));

        step("Check 'Electronics' item was open", () ->
                mainPages.checkOpenedPage("Home / Electronics"));

    }

    @AllureId("3656")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Apparel & Shoes' item via CATEGORIES ")
    void testOpenedApparelShoesItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Apparel & Shoes' item", () ->
                mainPages.opensTabs("Apparel & Shoes"));

        step("Check 'Apparel & Shoes' item was open", () ->
                mainPages.checkOpenedPage("Home / Apparel & Shoes"));

    }

    @AllureId("3657")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Digital downloads' item via CATEGORIES ")
    void testOpenedDigitalDownloadsItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Digital downloads item", () ->
                mainPages.opensTabs("Digital downloads"));

        step("Check 'Digital downloads' item was open", () ->
                mainPages.checkOpenedPage("Home / Digital downloads"));

    }

    @AllureId("3658")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Jewelry' item via CATEGORIES ")
    void testOpenedJewelryItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Jewelry' item", () ->
                mainPages.opensTabs("Jewelry"));

        step("Check 'Jewelry' item was open", () ->
                mainPages.checkOpenedPage("Home / Jewelry"));

    }

    @AllureId("3659")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Gift Cards' item via CATEGORIES ")
    void testOpenedGiftCardsItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Gift Cards' item", () ->
                mainPages.opensTabs("Gift Cards"));

        step("Check 'Gift Cards' item was open", () ->
                mainPages.checkOpenedPage("Home / Gift Cards"));

    }

    @AllureId("3660")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Desktops' item via CATEGORIES ")
    void testOpenedDesktopsItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Desktops' item", () ->{
                mainPages.opensTabs("Computers")
                         .opensTabs("Desktops");
                });

        step("Check 'Desktops' item was open", () ->
                mainPages.checkOpenedPage("Home / Computers / Desktops"));

    }

    @AllureId("3661")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Desktops' item via CATEGORIES ")
    void testOpenedNotebooksItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Notebooks' item", () ->{
            mainPages.opensTabs("Computers")
                    .opensTabs("Notebooks");
        });

        step("Check 'Notebooks' item was open", () ->
                mainPages.checkOpenedPage("Home / Computers / Notebooks"));

    }

    @AllureId("3662")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Accessories' item via CATEGORIES ")
    void testOpenedAccessoriesItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Accessories' item", () ->{
            mainPages.opensTabs("Computers")
                    .opensTabs("Accessories");
        });

        step("Check 'Accessories' item was open", () ->
                mainPages.checkOpenedPage("Home / Computers / Accessories"));

    }

    @AllureId("3663")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Camera, photo' item via CATEGORIES ")
    void testOpenedCameraPhotoItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Camera, photo' item", () ->{
            mainPages.opensTabs("Electronics")
                    .opensTabs("Camera, photo");
        });

        step("Check 'Camera, photo' item was open", () ->
                mainPages.checkOpenedPage("Home / Electronics / Camera, photo"));

    }

    @AllureId("3664")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check opened 'Cell phones' item via CATEGORIES ")
    void testOpenedPhoneItem(){
        step("Open main page", () ->
                open(""));

        step("Seleck 'Cell phones' item", () ->{
            mainPages.opensTabs("Electronics")
                    .opensTabs("Cell phones");
        });

        step("Check 'Accessories' item was open", () ->
                mainPages.checkOpenedPage("Home / Electronics / Cell phones"));

    }

    @AllureId("3665")
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

    @AllureId("3666")
    @ManualMember("c05-katyushun")
    @AutoMember("katyushin")
    @Component("UI")
    @Test
    @DisplayName("Check that the cart was empty by default")
    void testEmptyCadrd(){
        step("Open main page", () ->
                open(""));

        step("Go to the Shopping cart", () ->
                mainPages.opensHeaderTabs("Shopping cart"));

        step("Check that the cart was empty by default", () ->
                mainPages.validationMessage(".order-summary-content","Your Shopping Cart is empty!"));

    }

    @AllureId("3667")
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
                mainPages.validationMessage(".wishlist-content","The wishlist is empty!\n"));

    }
}
