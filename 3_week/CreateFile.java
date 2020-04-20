package FileStudent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class CreateFile {

        public static void main(String[] args) {
            File file = new File("NameOfStudents.txt");
            System.out.println(file.exists());
            if (!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Введіть ПІБ студента через пробіл:");

            try {
                String str = input.nextLine();
                int spaceIndex = str.indexOf(' ');
                String surName = str.substring(0, spaceIndex);

                BufferedReader br = new BufferedReader(new FileReader(file));
                String lineFromFile;
                while ((lineFromFile = br.readLine()) != null) {
                    int spaceIndexFile = lineFromFile.indexOf(' ');
                    String surNameFile = lineFromFile.substring(0, spaceIndex);
                    if (surName.compareToIgnoreCase(surNameFile) == 0) {
                        System.out.println("Таке прізвище вже записане у файлі!");
                        br.close();
                        return;
                    }
                }
                usingPath(str);
            } catch (IOException ioException) {
                System.out.println("Exception");
            } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                System.out.println("Відсутній пробіл в тексті");
            }

            System.out.println(file.getAbsolutePath());
            input.close();
        }

    public static void usingPath(String str) throws IOException
    {
        Path path = Paths.get("D:\\QA\\Genesis\\Ex_3_java_holichenko\\NameOfStudents.txt");

        String name = str + "\n";
        Files.write(path, name.getBytes(), StandardOpenOption.APPEND);

    }


}
