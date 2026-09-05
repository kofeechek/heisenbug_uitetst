package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private SelenideElement registrationTab = $x("//a[contains(normalize-space(), 'Создать Личный кабинет')]");

    @Step("Кликаем по вкладке 'Создать Личный кабинет'")
    public LoginPage clickRegistrationTab() {
        registrationTab.click();

        return this;
    }


}
