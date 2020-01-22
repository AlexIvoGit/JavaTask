package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args.length > 0) {
            switch (args[0]) {
                case ("-c"): /*-c name1 sex1 bd1 name2 sex2 bd2 ...*/
                    synchronized (allPeople) {
                        for (int i = 0; i < args.length - 1; i += 3) {
                            Date dateBD = new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 3]);
                            if (args[i + 2].equals("м")) {
                                allPeople.add(Person.createMale(args[i + 1], dateBD));
                                System.out.println(allPeople.size() - 1);
                            } else if (args[i + 2].equals("ж")) {
                                allPeople.add(Person.createFemale(args[i + 1], dateBD));
                                System.out.println(allPeople.size() - 1);
                            }
                        }
                    }
                    break;
                case ("-u"): /*-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...*/
                    synchronized (allPeople) {
                        for (int i = 0; i < args.length - 1; i += 4) {
                            Date dateBD = new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 4]);
                            Sex sex1 = null;
                            if (args[i + 3].equals("м")) {
                                sex1 = Sex.MALE;
                            } else if (args[i + 3].equals("ж")) {
                                sex1 = Sex.FEMALE;
                            }
                            allPeople.get(Integer.parseInt(args[i + 1])).setName(args[i + 2]);
                            allPeople.get(Integer.parseInt(args[i + 1])).setSex(sex1);
                            allPeople.get(Integer.parseInt(args[i + 1])).setBirthDate(dateBD);
                        }
                    }
                    break;
                case ("-d"): /*-d id1 id2 id3 id4 ...*/
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            allPeople.get(Integer.parseInt(args[i])).setName(null);
                            allPeople.get(Integer.parseInt(args[i])).setSex(null);
                            allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                        }
                    }
                    break;
                case ("-i"): /*-i id1 id2 id3 id4 ...*/
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            int id = Integer.parseInt(args[i]);
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
                        break;
                    }
            }
        }
    }
}
