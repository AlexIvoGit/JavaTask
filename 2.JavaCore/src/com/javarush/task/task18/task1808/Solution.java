package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());
        reader.close();

        byte[] smallBuff = new byte[file1.available() / 2];
        byte[] bigBuff = new byte[file1.available() - smallBuff.length];

        file1.read(bigBuff);
        file2.write(bigBuff);
        file2.close();

        file1.read(smallBuff);
        file3.write(smallBuff);
        file3.close();

        file1.close();
    }
}
