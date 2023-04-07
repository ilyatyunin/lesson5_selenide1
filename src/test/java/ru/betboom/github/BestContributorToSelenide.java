package ru.betboom.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {
    @Test
    void andreiSolntsevShouldBeFirstContributor() {
        // Configuration.browserSize = "1920x1080";
        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$$("li").first().hover();
                // .closest("h2").sibling(0).$$("li").first().hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));


    }
}
