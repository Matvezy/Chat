package com.matvey.filters;

import java.util.ArrayList;
import java.util.List;

public class NoRacismFilter implements ChatFilter {
//test
    @Override
    public String filter(String message) {
        List<String> censoredList = new ArrayList<String>();
        censoredList.add("nigga");
        censoredList.add("nigger");
        censoredList.add("black ass");
        for (String word: censoredList) {
            message = message.replaceAll(word, "brother");
        }

        return message;
    }


}
