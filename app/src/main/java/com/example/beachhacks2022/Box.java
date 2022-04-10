package com.example.beachhacks2022;

import java.io.Serializable;
import java.util.ArrayList;

public class Box implements Serializable {
    private String boxName;
    ArrayList<String> listOfItems;

    public void addItem(String item)
    {
        listOfItems.add(item);
    }
}
