package ru.job4j.collection;

import java.util.*;
import java.util.regex.Pattern;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String str = "";
            String regex = "^K\\d|^k\\d";
            for (String el : value.split("/")) {
                if (Pattern.matches(regex, el))
                    str = el;
                else {
                    if (str.equals(""))
                        str = el;
                    str = str + "/" + el;
                }
                tmp.add(str);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}

