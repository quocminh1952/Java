package org.example;

import java.lang.reflect.Field;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Cat newCat = new Cat();

        // get fields of Cat class
        Field[] fields = newCat.getClass().getDeclaredFields();

        for(Field field: fields){
            System.out.println(field.getName());
        }

        // get "name" field of Cat and assign it for nameField
        Field nameField = newCat.getClass().getDeclaredField("name");

    }
}