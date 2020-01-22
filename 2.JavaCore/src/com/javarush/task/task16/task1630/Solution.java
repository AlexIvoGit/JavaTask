package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
        }
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fullLine = "";
        String fullFileName;

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        public String getFileContent() {
            return fullLine;
        }

        @Override
        public void run() {
                try {
                    fullLine = "";
                    BufferedReader br = new BufferedReader(new FileReader(fullFileName));
                    String line;
                    while ((line = br.readLine()) != null) {
                        fullLine += line + " ";
                    }
                    br.close();
                }catch (IOException e){
                    System.out.println(e);
                }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
}
