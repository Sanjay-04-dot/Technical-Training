package Inheritance;

public class HierachialSuperHeroLevel {
    void displaySuperhero(){
        System.out.println("1. Super Man\n2. Bat Man\n3. Spider Man\n4. Iron Man");
    }
}

class superman extends HierachialSuperHeroLevel {
    void displaySuperman(){
        System.out.println("yes, SuperMan is a SuperHero");
    }
}

class BatMan extends HierachialSuperHeroLevel {
    void displayBatman(){
        System.out.println("yes BatMan is a SuperHero");
    }
}

class SpiderMan extends HierachialSuperHeroLevel {
    void displaySpiderman(){
        System.out.println("yes SpiderMan is a SuperHero");
    }
}

class superhero{

public static void main(String[] args) {
    SpiderMan spider = new SpiderMan();
    BatMan bat = new BatMan();
    superman man= new superman();

    spider.displaySuperhero();
    spider.displaySpiderman();
    man.displaySuperman();
    bat.displayBatman();
    }
}




