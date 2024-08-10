package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class SystemPropertiesTests {

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
    @Tag("one_property")
    void simpleProperty6Test(){


        System.out.println(format("Hello,%s!",System.getProperty("user_name","unkown student")));


    }





}
