package com.company.heroes;

import com.company.characters.MainActivityOfCharacters;

/**
 * Created by Artem on 13.11.2016.
 */
public class WaterDragon implements MainActivityOfCharacters {

    @Override
    public void awaken() {
        String activity = "ваш водный дракончик проснулся";
        System.out.println(activity.toUpperCase());
    }

    @Override
    public void relax() {
        String activity = "ваш водный дракончик хочет отдохнуть";
        System.out.println(activity.toUpperCase());
    }

    @Override
    public void eat() {
        String activity = "ваш водный дракончик хочет покушать";
        System.out.println(activity.toUpperCase());
    }

    @Override
    public void read() {
        String activity = "ваш водный дракончик хочет почитать книгу";
        System.out.println(activity.toUpperCase());
    }

    @Override
    public void play() {
        String activity = "ваш водный дракончик хочет поиграть";
        System.out.println(activity.toUpperCase());
    }

    @Override
    public void goToSleep() {
        String activity = "ваш водный дракончик идёт спать";
        System.out.println(activity.toUpperCase());
    }
}