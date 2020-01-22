package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();

        File file = new File(line);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        /*bufferedWriter.write(line);
        bufferedWriter.newLine();*/
        do {
            line = bufferedReader.readLine();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } while (!line.equals("exit"));

        /*while(true){
            line = bufferedReader.readLine();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            if (line.equals("exit")){
                break;}
        }*/

        bufferedReader.close();
        bufferedWriter.close();
    }
}
