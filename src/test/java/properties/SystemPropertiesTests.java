package properties;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

import static java.lang.String.format;

public class SystemPropertiesTests  {

    private static final Logger logger = LoggerFactory.getLogger(SystemPropertiesTests.class);

    @Test
    void simplePropertyTest(){
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test

    void simpleProperty1Test(){
        System.setProperty("browser","opera");
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test

    void simpleProperty2Test(){
        String browserName = System.getProperty("browser","mozilla");
        System.out.println(browserName);
    }

    @Test

    void simpleProperty3Test(){
        System.setProperty("browser","opera");
        String browserName = System.getProperty("browser","mozilla");
        System.out.println(browserName);
    }

    @Test
    @Tag("one_property")
    void simpleProperty4Test(){

        String browserName = System.getProperty("browser","mozilla");
        System.out.println(browserName);

        // gradle clean one_property_test

        // gradle clean one_property_test-Dbrowser=safari
    }



    @Test
    @Tag("fast")


    void simpleProperty6Test(){
        logger.info("Начало выполнения теста simpleProperty6Test");




        System.out.println(format("Hello,%s!",System.getProperty("user_name","unknown student")));


    }
}
