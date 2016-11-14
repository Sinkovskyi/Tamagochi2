package com.company;

import com.company.heroes.Dragon;
import com.company.logicsAndStringConstantsForLogics.ConstructionForLogics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("ВЫБЕРИТЕ ПЕРСОНАЖА");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Введите одно из имён(Fire Dragon/Water Dragon) и введите его: ");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String nameOfHeroes = br.readLine().trim().replaceAll(" ", "");


   
        Dragon dragon = new Dragon(nameOfHeroes);
        dragon.awaken();

        int a = 1;

        for(int i = 0; i<=6; i++) {
            if(a == 3){
                System.out.println("Ваш динозаврик улетел от Вас и больше не вернётся :( ");
                break;
            }

            int randNumber = (int) (1 + Math.random() * 4);

            if (randNumber == 1) {
                dragon.relax();

                ConstructionForLogics constructionForLogics = new ConstructionForLogics();
                //constructionForLogics.verification(randNumber);
                a += constructionForLogics.verification(randNumber);

            } else if (randNumber == 2) {
                dragon.eat();

                ConstructionForLogics constructionForLogics = new ConstructionForLogics();
                //constructionForLogics.verification(randNumber);
                a += constructionForLogics.verification(randNumber);

            } else if (randNumber == 3) {
                dragon.read();

                ConstructionForLogics constructionForLogics = new ConstructionForLogics();
                //constructionForLogics.verification(randNumber);
                 a += constructionForLogics.verification(randNumber);
            } else if (randNumber == 4) {
                dragon.play();

                ConstructionForLogics constructionForLogics = new ConstructionForLogics();
                //constructionForLogics.verification(randNumber);
                a += constructionForLogics.verification(randNumber);
            }
        }

        if(a!=3){
            System.out.println("ВЫ ХОРОШО СПРАВИЛИСЬ!");
            dragon.goToSleep();
        }
        else{
            System.out.println("ВЫ ПРОИГРАЛИ");
        }

    }
}
