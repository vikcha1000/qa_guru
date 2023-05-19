package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @Test
    void DragAndDropAction(){
        //Configuration.browserSize = "1920x1800";
        //открыть тестовую страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // совершить перемещение
        //actions().moveToElement($(byText("A"))).clickAndHold().moveByOffset(300, 1).release().perform();
        //Проверка, что кубики переместились
        $("#column-a").shouldHave(text("B"));

    }

    @Test
    void DragAndDropByDrag(){
        //открыть тестовую страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // совершить перемещение
        $("#column-a").dragAndDropTo($("#column-b"));
        //Проверка, что кубики переместились
        $("#column-a").shouldHave(text("B"));

    }

}
