package practice9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Files {
    private static final String path = "src//files//";

    public static void main(String[] args) throws IOException {
        for (String line : fileArray("text1.txt")) {
            System.out.println(line);
        }

        fileWrite("testtest test");

        clayFiles();
        replaceFile1();
    }

    private static List<String> fileArray(String fileName) {
        List<String> list = new ArrayList<>();
        File file = new File(path + fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {

                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return list;

    }

    private static void fileWrite(String s) {
        File file = new File(path + "text2.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void clayFiles() {
        File file = new File(path + "text3.txt");


        try (FileWriter writer = new FileWriter(file)) {

            for (int i = 1; i < 3; i++) {

                for (String line : fileArray(String.format("text%d.txt", i))) {

                    writer.write(line + "\n");

                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void replaceFile1() throws IOException {

        String filePath = "C:\\Users\\Person\\IdeaProjects\\LastITMO1\\src\\files\\text1.txt";


        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String modifiedContent = content.toString().replaceAll("[^a-zA-Z0-9]", "\\$");


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(modifiedContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File edit");
    }


}



