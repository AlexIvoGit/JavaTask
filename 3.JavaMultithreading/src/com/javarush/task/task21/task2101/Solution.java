package com.javarush.task.task21.task2101;

/*
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] bytes = new byte[4];
        for (int i = 0; i < ip.length; i++) {
            bytes[i] = (byte) (ip[i] & mask[i]);
        }
        /*System.out.println(Byte.toUnsignedInt(bytes[0]) + " " + Byte.toUnsignedInt(bytes[1]) + " " +
                Byte.toUnsignedInt(bytes[2]) + " " + Byte.toUnsignedInt(bytes[3]));*/
        return bytes;
    }

    public static void print(byte[] bytes) {
        String[] strings = new String[4];
        for (int i = 0; i < bytes.length; i++) {
            int a = Byte.toUnsignedInt(bytes[i]);
            String aa = Integer.toBinaryString(a);
            String s = String.format("%08d",Integer.parseInt(aa));
            strings[i] = s;
        }
        System.out.println(strings[0] + " " + strings[1] + " " + strings[2] + " " + strings[3]);
    }
}
