package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Feature("Heisenbug Issue")
@Story("Страница расписания Heisenbug")
@Tag("Test")
@Owner("SvetlitskayaTS")
public class TimetableTest extends TestBase {


    @Test
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка страницы расписания")
    void timeTableTest() {
        mainPage.openPage()
                .clickTimetableButton();
        timeteblePage.openTimetablePageCheck(testData.timetableTitle);
    }
}
