package simple;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple1")

public class NegativeTest extends TestBase {

    @Test

    public void typoTest22(){

        Selenide.open("https://demoqa.com/automation-practice-form");
        $x("//h5").shouldHave(text("Student Registration Form"));
        $x("//input[contains(@id,'firstName')]").setValue("Shilo");
        $x("//input[contains(@id,'lastName')]").setValue("Krovostok");
        $x("//input[contains(@id,'dateOfBirthInput')]").click();
        $x("//select[contains(@class,'react-datepicker__year-select')]").selectOption("1993");
        $x("//select[contains(@class,'react-datepicker__month-select')]").selectOption("January");
        $x("//div[contains(@class,'react-datepicker__day react-datepicker__day--003')][not(contains(@class,'day--outside-month'))]").click();

        //div[contains(@class,'react-datepicker__day react-datepicker__day--003')][@aria-label,"January"]

        //select[contains(@class,'react-datepicker__month-select')]
        Selenide.sleep(10000);




    }
}
