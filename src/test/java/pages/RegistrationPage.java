package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {


    private SelenideElement emailInput = $("#registration-email");
    private SelenideElement createButton = $x("//button[@jctestingmaker='actionTarget' and @aria-label='Создать']");
    private SelenideElement approveEmailMessage = $x("//h2[contains(normalize-space(), 'Подтвердите email')]");
    private SelenideElement wrongEmailMessage = $x("//jc-field-error");


    @Step("Заполняем поле 'Email'")
    public RegistrationPage typeEmail(String value) {
        emailInput.shouldBe(visible).setValue(value);

        return this;
    }

    @Step("Кликаем по кнопке 'Создать'")
    public RegistrationPage clickCreateButton() {
        createButton.click();

        return this;
    }

    @Step("Проверяем сообщение о проверке Email")
    public RegistrationPage approveEmailMessageCheck(String value) {
        approveEmailMessage.shouldHave(text(value));

        return this;
    }

@Step("Проверяем сообщение об ошибке о некорректном Email")
public RegistrationPage wrongEmailMessageCheck(String value) {
    wrongEmailMessage.shouldHave(text(value));

    return this;
}

}
