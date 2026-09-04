package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TimeteblePage {

    private SelenideElement timetableButton = $(".ScheduleTabs-module-scss-module__B3e_-q__scheduleTabs__text");

    @Step("Проверяем открытие страницы расписания")
    public TimeteblePage openTimetablePageCheck(String value) {
        timetableButton.shouldHave(text(value));

        return this;
    }

}
