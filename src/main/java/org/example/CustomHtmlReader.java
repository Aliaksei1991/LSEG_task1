package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CustomHtmlReader {
    public void parsePageAndSaveTableInHtml(String page) throws IOException {
        Document document = Jsoup.connect(page).get();
        Elements table = document.select("table");

        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("file_to_save_table.html"))) {
            byte[] buffer = table.outerHtml().getBytes(StandardCharsets.UTF_8);
            outputStream.write(buffer, 0, buffer.length);
        }
    }
}
