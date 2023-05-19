package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestContributerToSelenide {


    @Test
    void solntsevShouldBeTheTopContributer(){
        // открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        //опусти мышку к первому аватару из блока contribution
        $(".BorderGrid").$(byText("Contributors")).ancestor(".BorderGrid-row").
                $$("ul li").first().hover();
        //проверка: во всплывающем окне есть
        $("[aria-label=\"user login and name\"]").shouldHave(text("asolntsev Andrei Solntsev"));

    }
}
