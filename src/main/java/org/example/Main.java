package org.example;

public class Main {
    public static void main(String[] args) {
        String s = toCamelCase("the-stealth-warrior");
        System.out.println(s);

    }
    public static String toCamelCase(String str) {
        String[] split = str.split("-");
        String values = "";
        for (String camel : split) {
            values += toProperCase(camel);
        }
        return values;

    }
    private static String toProperCase(String str) {
        return str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
