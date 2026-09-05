package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка кнопки 'Получать апдейты'")
    void updatesReceiveButtonTest() {
        mainPage.openPage()
                .clickTimetableButton();
        timeteblePage.getUpdatesButtonClick()
                .getUpdatesModalWindowCheck(testData.getUpdatesByEmailTitle);
    }

}
