package com.cybertek.homeTask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeMap {

    public static void main(String[] args) {

        Map<String, String > row1 = new LinkedHashMap<>();
        row1.put("cell1","MyMoney");
        row1.put("cell2", "$300");
        row1.put("cell3", "8%");

        Map<String, String > row2 = new LinkedHashMap<>();
        row2.put("cell1","FamilyAlbum");
        row2.put("cell2", "$80");
        row2.put("cell3", "15%");

        Map<String, String > row3 = new LinkedHashMap<>();
        row3.put("cell1","ScreenSaver");
        row3.put("cell2", "$20");
        row3.put("cell3", "10%");

        ArrayList<Map> listOfProducts = new ArrayList<>(Arrays.asList(
                row1,
                row2,
                row3

        ));


        System.out.println("listOfProducts = " + listOfProducts);

    }


}
