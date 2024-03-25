package SOLID.Liskov;

public class Animal {
    public void walk() {  }
//    public void jump() {  }

    public void jumpHole(Animal a){
        a.walk();
//        a.jump();
        a.walk();
    }
}
