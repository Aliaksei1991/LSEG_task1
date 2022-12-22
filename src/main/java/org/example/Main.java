package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new CustomHtmlReader().parsePageAndSaveTableInHtml("https://www.ote-cr.cz/en/statistics/electricity-imbalances?version=0&date=2022-12-20");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

