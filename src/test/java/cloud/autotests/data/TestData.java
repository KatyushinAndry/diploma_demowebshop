package cloud.autotests.data;

import cloud.autotests.config.demowebshop.AppConfig;
import org.aeonbits.owner.ConfigFactory;

public class TestData {
    static AppConfig appConfig = ConfigFactory.create
            (AppConfig.class, System.getProperties());

    public static String
            //be344afa-fd33-4eee-a621-1324d18b2232
            giftCard = appConfig.giftCard(),
            simpleComputer = appConfig.simpleComputer(),
            cookiAothorization = appConfig.cookiAothorization();

}

//product_attribute_72_5_18=53&product_attribute_72_6_19=54&product_attribute_72_3_20=57&product_attribute_72_8_30=93&product_attribute_72_8_30=94&product_attribute_72_8_30=95&addtocart_72.EnteredQuantity=1
//product_attribute_72_5_18=53&product_attribute_72_6_19=54&product_attribute_72_3_20=57&product_attribute_72_8_30=93&product_attribute_72_8_30=94&product_attribute_72_8_30=95&addtocart_72.EnteredQuantity=1
//product_attribute_72_5_18=53&product_attribute_72_6_19=54&product_attribute_72_3_20=57&product_attribute_72_8_30=93&product_attribute_72_8_30=94&product_attribute_72_8_30=95&addtocart_72.EnteredQuantity=1