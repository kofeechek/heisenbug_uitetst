package tests.testdata;

import com.github.javafaker.Faker;

public class TestData {

    public Faker faker = new Faker();

    public String name = faker.name().firstName();
    public String email = faker.internet().emailAddress();
    public String wrongEmail = faker.lorem().word();
    public String companyName = faker.lorem().word();
    public String message = faker.lorem().word();
    public String chooseTicketTitle = "Выбрать билет";
    public String getUpdatesByEmailTitle = "Heisenbug в email";
    public String toBeAPartnerTitle = "Стать партнером";
    public String englishMainPageTitle = "testing not just for testers";
    public String searchButtonAtModalWindowText = "Найти";
    public String timetableTitle = "Расписание";
    public String iconAttributeName = "href";
    public String iconAttributeValue = "/img/sprite.svg#exclamation";
    public String successRegistrationMessage = "Подтвердите email";
    public String wrongEmailMessage = "Это не email, попробуйте еще раз";

}
