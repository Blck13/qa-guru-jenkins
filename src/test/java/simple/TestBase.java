package simple;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.qameta.allure.internal.shadowed.jackson.databind.type.LogicalType.Map;
import static java.awt.AWTEventMulticaster.add;
import static javax.swing.UIManager.put;

public class TestBase {
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
        Configuration.browserCapabilities = capabilities;
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 30000;


    }

    }
