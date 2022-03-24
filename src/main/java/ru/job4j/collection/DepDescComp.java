package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    public int compare(String o1, String o2) {
        int rtn = 0;
        String[] str1 = o1.split("/");
        String[] str2 = o2.split("/");
        int x = str1.length < str2.length ? str1.length : str2.length;
        for (int i = 0; i < x; i++) {
            if ((str1[i].equals(str2[i]))) {
                if (str1.length == 1 || str2.length == 1) {
                    if (str1.length == 1) {
                        rtn = -1;
                        break;
                    } else {
                        rtn = 1;
                        break;
                    }
                }
            } else {
                if (i == 0)
                    rtn = str1[i].compareTo(str2[i]) * -1;
                else
                    rtn = str1[i].compareTo(str2[i]);
                break;
            }
        }
        return rtn;
    }
}
