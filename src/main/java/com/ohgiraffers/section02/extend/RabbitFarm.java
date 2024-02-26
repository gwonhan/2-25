package com.ohgiraffers.section02.extend;

public class RabbitFarm <T extends Rabbit>{

    /*필기. 타입 변수는 아직 어떤 토끼가 들어올지 몰느다.
    *       다만 토끼이거나 토끼의 후손만 가능하다.
    * */

    private T animal;

    public RabbitFarm(){}

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public RabbitFarm(T animal){
        this.animal = animal;




    }
}
