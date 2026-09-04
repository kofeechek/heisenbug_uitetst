package tests;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.testdata.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationTest extends TestBase {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка успешной регистрации пользователя")
    void customBuyTicketFormPositiveTest() {
        mainPage.openPage()
                .clickAuthorizationButton();
        loginPage.clickRegistrationTab();
        registrationPage.typeEmail(testData.email)
                .clickCreateButton()
                .approveEmailMessageCheck(testData.successRegistrationMessage);
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка неуспешной регистрации пользователя - некорректный email")
    void customBuyTicketFormNegativeTest() {
        mainPage.openPage()
                .clickAuthorizationButton();
        loginPage.clickRegistrationTab();
        registrationPage.typeEmail(testData.wrongEmail)
                .clickCreateButton()
                .wrongEmailMessageCheck(testData.wrongEmailMessage);
    }

}
