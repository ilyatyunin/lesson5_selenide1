package ru.betboom.github;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ExamplesLesson6 {
    @Test
    void collections() {
        open("http://github.com");
        $$("li.HeaderMenu-item").shouldHave(texts("Products", "Solutions", "Open Source", "Pricing")); // поиск коллекции элементов в хедере, над ней не совершаются действия, она нужна чтоб собрать элементы
        $$("li.HeaderMenu-item").get(1); // найти второй элемент
        $$("li.HeaderMenu-item").filterBy(visible).first().click(); // кликнуть на первый видимый элемент
        // $("").scrollTo(); // скролл к элементу, обычно не используем, но иногда иначе не работает




    }

    @Test
    void siblings() {
        open("http://github.com/enterprise");
        $("h1").sibling(0).shouldHave(text("Increase"));
        $("h1").preceding(0).shouldHave(text("for enterprises"));
    }
}
