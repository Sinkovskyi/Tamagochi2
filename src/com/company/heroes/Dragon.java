package com.company.heroes;

import com.company.characters.MainActivityOfCharacters;


/**
 * Created by Artem on 13.11.2016.
 *
 */
public class Dragon {

    String nameOfHeroes;
    MainActivityOfCharacters mainActivityOfCharacters;

    public Dragon( String nameOfHeroes){
        super();
        this.nameOfHeroes = nameOfHeroes;
        setMainActivityOfCharacters();
    }

    public void setMainActivityOfCharacters(MainActivityOfCharacters mainActivityOfCharacters){
        this.mainActivityOfCharacters = mainActivityOfCharacters;
    }

    private void setMainActivityOfCharacters() {
        if(nameOfHeroes.equals("WaterDragon") ){
            System.out.println("Помогайте Вашему Водному дракончику на протяжении дня нажимая правильную цифру для подтвеждения его действия");
            setMainActivityOfCharacters(new WaterDragon());
        }
        else if(nameOfHeroes.equals("FireDragon")){
            System.out.println("Помогайте Вашему Огненному дракончику на протяжении дня нажимая правильную цифру для подтвеждения его действия");
            setMainActivityOfCharacters(new FireDragon());

        }
    }

    public void awaken(){mainActivityOfCharacters.awaken();}

    public void relax(){
        mainActivityOfCharacters.relax();
    }

    public void eat(){
        mainActivityOfCharacters.eat();
    }

    public void read(){
        mainActivityOfCharacters.read();
    }

    public void play(){
        mainActivityOfCharacters.play();
    }

    public void goToSleep(){
        mainActivityOfCharacters.goToSleep();
    }

}
