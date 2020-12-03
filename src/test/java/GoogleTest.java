import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void SearchSelenide() {
        open("https://www.google.com/");
        $("[name='q']").setValue("Selenide").pressEnter();
        $("a[href='https://ru.selenide.org/']").shouldBe(Condition.visible);
    }
}
