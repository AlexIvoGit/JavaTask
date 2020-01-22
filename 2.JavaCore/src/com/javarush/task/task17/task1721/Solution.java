package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan1 = new Scanner(new FileReader(reader.readLine()));
        Scanner scan2 = new Scanner(new FileReader(reader.readLine()));
        while (scan1.hasNextLine()) {
            allLines.add(scan1.nextLine());
        }
        while (scan2.hasNextLine()) {
            forRemoveLines.add(scan2.nextLine());
        }
        Solution solution = new Solution();
        solution.joinData();

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
