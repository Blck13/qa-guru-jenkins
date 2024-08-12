package properties;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

public class TestBase1 {
    @BeforeAll
    static void beforeAll() {

        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        java.util.Map<String, Boolean> map = new HashMap();
        map.put("enableVNC", true);
        map.put("enableVideo", true);

        capabilities.setCapability("selenoid:options", map);
//        capabilities.setCapability("selenoid:options", Map.(
//                "enableVNC", true,
//                "enableVideo", true
//        ));
//        Configuration.browserCapabilities = capabilities;
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 30000;


    }

    }
