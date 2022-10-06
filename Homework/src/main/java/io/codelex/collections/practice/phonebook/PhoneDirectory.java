package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private Map<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    private boolean find(String name) {

        if (data.containsKey(name)) {
            return true;
        } else {
            return false;
        }
    }

    public String getNumber(String name) {
        if (find(name)) {
            return data.get(name);
        } else {
            return null;
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        data.put(name, number);
    }

}
