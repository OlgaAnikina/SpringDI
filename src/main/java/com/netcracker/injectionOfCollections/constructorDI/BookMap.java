package com.netcracker.injectionOfCollections.constructorDI;

import java.util.Map;

public class BookMap {
    Map<String,Integer> map;

    public BookMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getBookMap() {
        return map;
    }

    public int sizeofBookMap() {
        return map.size();
    }
}
