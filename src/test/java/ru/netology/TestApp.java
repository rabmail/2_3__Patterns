package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TestApp {


    @BeforeEach
    void shouldOpenWebApp() {
        open("http://localhost:9999");
    }

    @Test
    void shouldTestValidation() {
        $("[data-test-id=city] input").setValue(TestSet.setCity());
        $("[data-test-id=date] input").setValue(TestSet.setDate(3));
        $("[data-test-id=name] input").setValue(TestSet.setFIO());
        $("[data-test-id=phone] input").setValue(TestSet.setPhone());
        $("[data-test-id=agreement]").click();
        $$("button").get(1).click();
        $("[data-test-id='success-notification']").waitUntil(visible, 15000).shouldHave(text("Успешно!"));

        $("[data-test-id=date] input").setValue(TestSet.setDate(5));
        $(withText("Запланировать")).click();
        $$("button").get(1).click();
        $(withText("Перепланировать")).click();
        $("[data-test-id='success-notification']").waitUntil(visible, 15000).shouldHave(text("Успешно!"));
        }

            //    @Test
//    void shouldTestWorkingDropDownMenuCity() {
//        $("[data-test-id=city] input").sendKeys("Бе", Keys.ARROW_DOWN, Keys.ENTER);
//        $("[data-test-id=date] input").setValue(SetDate(3));
//        $("[data-test-id=name] input").setValue("Пупкин Василий");
//        $("[data-test-id=phone] input").setValue("+79102280000");
//        $("[data-test-id=agreement]").click();
//        $$("button").get(1).click();
//        $("[data-test-id=notification]").shouldBe((visible), Duration.ofSeconds(15));
//    }
//    @Test
//    void shouldTestWorkingDropDownMenuDate() {
//        $("[data-test-id=city] input").sendKeys("Бе", Keys.ARROW_DOWN, Keys.ENTER);
//        $("[data-test-id=date] input").sendKeys(Keys.CONTROL,Keys.BACK_SPACE);
//        $("[data-test-id=date] input").setValue(SetDate(7));
//        $("[data-test-id=name] input").setValue("Пупкин Василий");
//        $("[data-test-id=phone] input").setValue("+79102280000");
//        $("[data-test-id=agreement]").click();
//        $$("button").get(1).click();
//    }
}
