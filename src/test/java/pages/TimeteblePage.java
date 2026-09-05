package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TimeteblePage {

    private SelenideElement timetableButton = $(".ScheduleTabs-module-scss-module__B3e_-q__scheduleTabs__text");
    private SelenideElement getUpdatesButton = $("#subscription-schedule-progress-trigger");
    private SelenideElement getUpdatesByEmailTitle = $x("//h3[contains(., 'email')]");

    @Step("Проверяем открытие страницы расписания")
    public TimeteblePage openTimetablePageCheck(String value) {
        timetableButton.shouldHave(text(value));

        return this;
    }

    @Step("Нажимаем кнопку 'Получать апдейты'")
    public TimeteblePage getUpdatesButtonClick() {
        getUpdatesButton.click();

        return this;
    }

    @Step("Проверяем заголовок подписки на email")
    public TimeteblePage getUpdatesModalWindowCheck(String value) {
        getUpdatesByEmailTitle.shouldHave(text(value));

        return this;
    }

}
