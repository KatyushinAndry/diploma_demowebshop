package cloud.autotests.config.demowebshop;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@org.aeonbits.owner.Config.Sources({
        "system:properties",
        "classpath:config/demowebshop/app.properties"
})
public interface AppConfig extends org.aeonbits.owner.Config {

    @Key("webUrl")
    String webUrl();

    @Key("apiUrl")
    String apiUrl();


}
