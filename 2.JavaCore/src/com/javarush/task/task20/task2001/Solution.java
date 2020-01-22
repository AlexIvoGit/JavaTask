package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            /*File your_file_name = File.createTempFile("c:\\Temp\\FileSave.txt", null);*/
            File your_file_name = new File("c:\\Temp\\FileSave.txt");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            if(ivanov.equals(somePerson)){
                System.out.println("Yes");
            }

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            String isName = name != null ? "Yes," : "No,";
            String isAssets = assets != null ? "Yes," : "No,";

            outputStream.write(isName.getBytes());
            outputStream.write(isAssets.getBytes());

            if (name != null) {
                String name1 = name + ",";
                outputStream.write(name1.getBytes());
            }
            if (assets != null) {
                for (int i = 0; i < assets.size(); i++) {
                    String nameAssets = assets.get(i).getName() + ",";
                    double priceAssets = assets.get(i).getPrice();
                    String priceAssetss = priceAssets + ",";
                    outputStream.write(nameAssets.getBytes());
                    outputStream.write(priceAssetss.getBytes());
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            String line = "";
            while (inputStream.available() > 0) {
                int i = inputStream.read();
                line += (char) i;
            }
            String[] strings = line.split(",");
            if (strings[0].equals("Yes")) {
                name = strings[2];
            }
            if (strings[1].equals("Yes")) {
                for (int i = 3; i < strings.length; i = i + 2) {
                    Asset asset = new Asset(strings[i], Double.parseDouble(strings[i + 1]));
                    assets.add(asset);
                }
            }
        }
    }
}
