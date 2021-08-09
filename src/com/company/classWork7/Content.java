package com.company.classWork7;

public class Content {
    private static String text;

    public static String getText() {
        String temp = "";
        String[] arr = text.split(" ");
        int count = 0;
        do{

            for (int i = 0; i < 10 && count < arr.length; i++) {
                temp = temp.concat(arr[count]);
                temp = temp.concat(" ");
                count++;
            }
            temp = temp.concat("\n");

        }while (count < arr.length);
        return temp;
    }

    public static void setText(String strtext) {
        text = strtext;
    }
}
