package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Feature("Heisenbug Issue")
@Story("Покупка билета")
@Tag("Test")
@Owner("SvetlitskayaTS")
public class BuyTicketTest extends TestBase {


    @Test
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка страницы расписания")
    void customBuyTicketFormTest() {
        mainPage.openPage()
                .clickBuyButton()
                .clickCorporateBuyButton();
        buyTicketPage.clickDiscusConditionsButton()
                .typeName(testData.name)
                .typeEmail(testData.email)
                .typeCompanyName(testData.companyName)
                .typeMessage(testData.message)
                .clickSubmitRequestButton()
                .confirmCaptchaIconCheck(testData.iconAttributeName, testData.iconAttributeValue);

    }
}

