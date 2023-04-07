package ru.betboom.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("https://github.com/");
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();

        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        sleep(10000);

        // ARRANGE -- подготовка
        // ACT -- действия
        // ASSERT -- проверка



    }
}
