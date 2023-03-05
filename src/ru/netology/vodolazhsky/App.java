package ru.netology.vodolazhsky;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static List objects = new ArrayList();
    private static boolean cont = true;
    private static String input;
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        System.out.println("Добро пожаловать в Memory Tool!");

        while (cont) {
            System.out.println(
                    "У меня есть " + objects.size() + " объект(а) в использовании: " +
                            (objects.size() * 10) + " MB." +
                            "\nЧто мне сделать?\n" +
                            "1. Создать объекты\n" +
                            "2. Удалить объекты\n" +
                            "0. Выйти");
            input = in.readLine();
            if ((input != null) && (input.length() >= 1)) {
                if (input.startsWith("0")) cont = false;
                if (input.startsWith("1")) createObjects();
                if (input.startsWith("2")) removeObjects();
            }
        }

        System.out.println("Bye!");
    }

    private static void createObjects() {
        System.out.println("Создание объектов...");
        for (int i = 0; i < 2; i++) {
            objects.add(new byte[10*1024*1024]);
        }
    }

    private static void removeObjects() {
        System.out.println("Удаление объектов...");
        int start = objects.size() - 1;
        int end = start - 2;
        for (int i = start; ((i >= 0) && (i > end)); i--) {
            objects.remove(i);
        }
    }
}
