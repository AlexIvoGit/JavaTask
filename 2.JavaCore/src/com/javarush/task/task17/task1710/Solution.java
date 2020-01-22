package com.javarush.task.task17.task1710;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        /*-c name sex bd*/
        if (args.length > 0) {
            if (args[0].equals("-c")) {
                String name = args[1];
                String sex = args[2];
                String bd = args[3];
                Date birthdayDate = new SimpleDateFormat("dd/MM/yyyy").parse(bd);
                if (sex.equals("м")) {
                    allPeople.add(Person.createMale(name, birthdayDate));
                } else if (sex.equals("ж")) {
                    allPeople.add(Person.createFemale(name, birthdayDate));
                }
                System.out.println(allPeople.size() - 1);

            }
            /*-u id name sex bd*/
            if (args[0].equals("-u")) {
                String id = args[1];
                String name = args[2];
                String sex = args[3];
                String bd = args[4];
                int id1 = Integer.parseInt(id);
                Sex sex1 = null;
                if (sex.equals("м")) {
                    sex1 = Sex.MALE;
                } else if (sex.equals("ж")) {
                    sex1 = Sex.FEMALE;
                }
                Date birthdayDate = new SimpleDateFormat("dd/MM/yyyy").parse(bd);
                allPeople.get(id1).setName(name);
                allPeople.get(id1).setSex(sex1);
                allPeople.get(id1).setBirthDate(birthdayDate);
            }
            /*-d id*/
            if (args[0].equals("-d")) {
                int id = Integer.parseInt(args[1]);
                allPeople.get(id).setName(null);
                allPeople.get(id).setSex(null);
                allPeople.get(id).setBirthDate(null);

            }
            /*-i id*/
            /*Миронов м 15-Apr-1990*/
            if (args[0].equals("-i")) {
                int id = Integer.parseInt(args[1]);
                String name = allPeople.get(id).getName();
                Sex sex = allPeople.get(id).getSex();
                String sex1;
                if (sex == Sex.MALE) {
                    sex1 = "м";
                } else {
                    sex1 = "ж";
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                Date birthdayDate = allPeople.get(id).getBirthDate();
                System.out.println(name + " " + sex1 + " " + simpleDateFormat.format(birthdayDate));
            }
        }
        /*System.out.println(allPeople.size());
        for (Person p : allPeople) {
            System.out.println(p.getName() + " " + p.getSex() + " " + p.getBirthDate());
        }*/

    }
}

