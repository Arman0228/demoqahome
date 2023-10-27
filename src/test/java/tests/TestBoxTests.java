package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class TestBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.pollingInterval = 400;
        Configuration.timeout = 4000;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("Alex@egorov.com");
        $("#currentAddress").setValue("Some Street 1");
        $("#permanentAddress").setValue("Another Street 1");
        $("#submit").click();

        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}


