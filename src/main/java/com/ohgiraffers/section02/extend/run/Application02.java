package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application02 {
    public static void main(String[] args) {

        /*수업목표. 와일드 카드에 대해 이해할 수 있다.*/

        /*필기.
        *  와읻르카드(wildCard)
        *  제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때
        *  그 객체의 타입변수를 제한할 수 있다.
        *  <?> : 제한 없음
        *  <? extends Type> : 와일드 카드 상한제한 (Type 과 Type 의 후손을 이용해 생성한 인스턴스만 가능)
        *  <? super Type> : 와일드 하한제한 (Type 과 Type 의 부모를 이용해 생성한 인스턴스만 가능)
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();

//        wildCardFarm.anytype(new RabbitFarm<Mammal>(new Rabbit())); // Rabbit 보다 더 큰 것을 받아와서 안됨

//        wildCardFarm.anytype(new RabbitFarm<Reptile>(new Reptile())); // 토끼의 후손이 아니라 사용 불가능



//        어떤 토끼농장이던 상관없이 매개변수로 사용 가능

        wildCardFarm.anytype(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anytype(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anytype(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));



//        Bunny 이거나 Bunny 의 후손들만 매개변수로 사용 가능하다
//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));     바니를 상속받는 녀석들로만 타입제한을 걸어놔서 안된다
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));


//        Bunny 이거나 Bunny 의 부모들만 매개변수로 사용 가능하다
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

    }

}
