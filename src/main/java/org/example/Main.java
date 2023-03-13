package org.example;

import com.google.gson.Gson;

public class Main {


    public static void main(String[] args) {

        Person p = new Person("Konstiantyn", "Kovalenko");

        Gson gson = new Gson();
        String jSonStructure = gson.toJson(p);

        System.out.println(jSonStructure);
    }
}