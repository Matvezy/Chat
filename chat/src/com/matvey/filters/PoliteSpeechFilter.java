package com.matvey.filters;

import java.util.LinkedList;
import java.util.List;

public class PoliteSpeechFilter implements ChatFilter {
    List<String> censoredList;

    public PoliteSpeechFilter() {
        censoredList = new LinkedList<>();
        censoredList.add("dick");
        censoredList.add("fuck");
        censoredList.add("retard");
        censoredList.add("shit");
    }

    @Override
    public String filter(String message) {
        for (String word: censoredList) {
            message = message.replaceAll(word, "***");
        }
        return message;
    }
}
