package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {


    @Test
    void shouldFindSelenideRepositoryAtTheTop (){
        //ARRANGE открыть галвную страницу
        open("https://github.com/");
        //ввести в поле поиска selenide и нажать enter
        $("[data-unscoped-placeholder=\"Search GitHub\"]").setValue("selenide").pressEnter();
        // кликнуть на первый репозиторий из списка найденных
        $$("ul.repo-list li").first().$("a").click();
        // проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
}
