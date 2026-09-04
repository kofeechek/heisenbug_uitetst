package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class BuyTicketPage {

    private SelenideElement discusConditionsButton = $("#corporate-custom-popup-btn");
    private SelenideElement nameInput = $("#registrationCustomDialog__name");
    private SelenideElement emailInput = $("#registrationCustomDialog__email");
    private SelenideElement companyNameInput = $("#registrationCustomDialog__company");
    private SelenideElement messageInput = $("#registrationCustomDialog__text");
    private SelenideElement submitRequestButton = $("[class*='registrationCustomDialog__submit']");
    private SelenideElement confirmCaptchaIcon = $("[class*='formStatus__icon'] use");


    @Step("Нажимаем кнопку 'Обсудить условия'")
    public BuyTicketPage clickDiscusConditionsButton() {
        discusConditionsButton.click();

        return this;
    }

    @Step("Заполняем поле 'Имя'")
    public BuyTicketPage typeName(String value) {
        nameInput.shouldBe(visible).setValue(value);

        return this;
    }

    @Step("Заполняем поле 'E-mail'")
    public BuyTicketPage typeEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    @Step("Заполняем поле 'Компания'")
    public BuyTicketPage typeCompanyName(String value) {
        companyNameInput.setValue(value);

        return this;
    }

    @Step("Заполняем поле 'Сообщение'")
    public BuyTicketPage typeMessage(String value) {
        messageInput.setValue(value);

        return this;
    }

    @Step("Нажимаем кнопку 'Оставить заявку'")
    public BuyTicketPage clickSubmitRequestButton() {
        submitRequestButton.click();

        return this;
    }

    @Step("Проверяем сообщение о необходимости пройти капчу")
    public BuyTicketPage confirmCaptchaIconCheck(String name, String value) {
        confirmCaptchaIcon.shouldHave(attribute(name, value));

        return this;
    }


}
