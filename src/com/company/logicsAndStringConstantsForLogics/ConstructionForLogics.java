package com.company.logicsAndStringConstantsForLogics;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Artem on 14.11.2016.
 */
public class ConstructionForLogics {

    public int verification(int randNumber) throws InterruptedException {
        String activity = activityOfHeroes(randNumber);
        int a = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите '" + randNumber + "' чтобы ваш дракончик " + activity + ": ");
        int number = scanner.nextInt();
        if (randNumber == number) {
            System.out.println("Отлично");
            TimeUnit.SECONDS.sleep(1);
            a += 0;
        }
        else {
            System.out.println("Вы ввели неправильно");
            a += 1;
            TimeUnit.SECONDS.sleep(1);
        }
        return a;
    }

    String activityOfHeroes(int randNumber) {
        String activity = "";
        switch (randNumber) {
            case 1:
                activity = "отдохнул";
                break;
            case 2:
                activity = "покушал";
                break;
            case 3:
                activity = "почитал";
                break;
            case 4:
                activity = "поиграл";
                break;
        }
        return activity;

    }
}