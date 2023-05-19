package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkLess

{


    @Test
    void JUnit5InSoftAssertions (){
        // открыть галвную страницу
        open("https://github.com/");
        //ввести в поле поиска selenide и нажать enter
        $("[data-unscoped-placeholder=\"Search GitHub\"]").setValue("selenide").pressEnter();
        // кликнуть на первый репозиторий из списка найденных
        $$("ul.repo-list li").first().$("a").click();
        //кликнуть на ссылку Wiki
        $("#wiki-tab").click();
        // раскрыть полный списко Pages
        $(".f6.Link--muted.js-wiki-more-pages-link.btn-link.mx-auto").click();
        // нажать на ссылкуSoftAssertions
        $(".m-0.p-0.list-style-none").$(byText("SoftAssertions")).click();
        // проверит, что при наведении блка под упоминанием junit5 содержится кнопка copy
       // $("#user-content-3-using-junit5-extend-test-class").ancestor("h4").sibling(0).
                //shouldHave(Condition.visible).$("clipboard-copy");
        $("#user-content-3-using-junit5-extend-test-class").ancestor("h4").sibling(0).hover()
              .shouldHave(Condition.visible).$("clipboard-copy");


    }

}
