package cloud.autotests.tests.concoleLog;

import cloud.autotests.annotations.AutoMember;
import cloud.autotests.annotations.Component;
import cloud.autotests.annotations.JiraIssue;
import cloud.autotests.annotations.ManualMember;
import cloud.autotests.listener.TestListener;
import cloud.autotests.tests.TestBase;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static cloud.autotests.helpers.DriverUtils.getConsoleLogs;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;

@ExtendWith(TestListener.class)
public class TestConsoleLog extends TestBase {

    @AllureId("3649")
    @Tags({@Tag("high"), @Tag("UI")})
    @JiraIssue("QC5-8")
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
}
