package tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RegistrationTest extends TestBase {

    @ValueSource(strings = {
            "lowercase@mail.ru", "111@ya.ru", "UPPERCASE@GMAIL.COM"
    })
    @ParameterizedTest
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка успешной регистрации пользователя c заполнением {0}")
    void customBuyTicketFormPositiveTest(String successEmail) {
        mainPage.openPage()
                .clickAuthorizationButton();
        loginPage.clickRegistrationTab();
        registrationPage.typeEmail(successEmail)
                .clickCreateButton()
                .approveEmailMessageCheck(testData.successRegistrationMessage);
    }

    @ValueSource(strings = {
            "lowercase", "111", "UPPERCASE"
    })
    @ParameterizedTest
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка неуспешной регистрации пользователя - некорректный email, c заполнением {0}")
    void customBuyTicketFormNegativeTest(String wrongEmail) {
        mainPage.openPage()
                .clickAuthorizationButton();
        loginPage.clickRegistrationTab();
        registrationPage.typeEmail(wrongEmail)
                .clickCreateButton()
                .wrongEmailMessageCheck(testData.wrongEmailMessage);
    }

}
