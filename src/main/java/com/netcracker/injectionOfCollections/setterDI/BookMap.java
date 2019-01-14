package com.netcracker.injectionOfCollections.setterDI;

import java.util.Map;

public class BookMap {
    Map<String,Integer> bookMap;

    public Map<String, Integer> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, Integer> map) {
        this.bookMap = map;
    }

    public int sizeBook() {
        return bookMap.size();
    }
}
