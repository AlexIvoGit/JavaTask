package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }

        @Override
        public Person read() throws IOException, ParseException {
            String line = fileScanner.nextLine();
            String[] strings = line.split("\\s", 4);
            String lastName = strings[0];
            String firstName = strings[1];
            String middleName = strings[2];
            String birthDayString = strings[3];
            Date birthDate = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH).parse(birthDayString);
            return new Person(firstName, middleName, lastName, birthDate);
        }
    }
}
