package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckEnterprize {


    @Test
    void CheckTextEnterprize () {
        // открыть галвную страницу
        open("https://github.com/");
        //навести мышь на меню Solution
        $(byText("Solutions")).hover();
        // клик по меню Enterprize
        $(byText("Enterprise")).click();
        // проверить заголовок
        $("h1").shouldHave(text("Build like the best"));






    }
}
