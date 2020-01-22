package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        String fileName = args[0];
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] strings = line.split(" ");
            if (strings.length > 4) {
                String name = strings[0] + " " + strings[1] + " " + strings[2];
                int month = Integer.parseInt(strings[4]);
                String m = String.format("%02d", month);
                int day = Integer.parseInt(strings[3]);
                String d = String.format("%02d", day);
                Date dateBH = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH).parse(d + m + strings[5]);
                PEOPLE.add(new Person(name, dateBH));
            } else {
                String name = strings[0];
                int month = Integer.parseInt(strings[2]);
                String m = String.format("%02d", month);
                int day = Integer.parseInt(strings[1]);
                String d = String.format("%02d", day);
                Date dateBH = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH).parse(d + m + strings[3]);
                PEOPLE.add(new Person(name, dateBH));
            }
        }
        fileReader.close();
        for (Person p : PEOPLE) {
            System.out.println(p.getName() + " " + p.getBirthDate());
        }
    }
}
