package cloud.autotests.annotations;

import io.qameta.allure.Feature;

import java.lang.annotation.*;

public @interface AllureFeatures {
    @Documented
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Feature("Issue")
    @ManualMember("user1")
    @AutoMember("nastiykr")
    @Component("API")
    @interface Issue {

    }

    @Documented
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Feature("PullRequests")
    @ManualMember("c05-nasstasya")
    @AutoMember("nastiykr")
    @Component("API")
    @interface PullRequests {

    }
}