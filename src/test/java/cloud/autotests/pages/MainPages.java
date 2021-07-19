package cloud.autotests.pages;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPages {

    public MainPages opensTabs(String text){
        $(".listbox").$(byText(text)).click();
        return this;
    }

    public MainPages checkOpenedPage(String text){
        $(".breadcrumb").shouldHave(text(text));
        return this;
    }

    public MainPages incorrectLogin(){
        $(".ico-login").click();
        $(".email").setValue("random@email.com");
        $(".password").setValue("randomemail");
        $(".login-button").click();
        return this;
    }

    public MainPages errorMessage(String text){
        $(".validation-summary-errors").shouldHave(text(text));
        return this;
    }

    public MainPages opensHeaderTabs(String text){
        $(".header-links").$(byText(text)).click();
        return this;
    }

    public MainPages validationMessage(String selector, String text){
        $(selector).shouldHave(text(text));
        return this;
    }

}
