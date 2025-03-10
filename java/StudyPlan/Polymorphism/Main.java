package StudyPlan.Polymorphism;

class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
}

class Pig extends Animal{
    public void sound(){
        System.out.println("Pig Sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog Sound");
    }
}
public class Main {
    public static void main(String[] args){
        Dog d = new Dog();
        Pig p = new Pig();
        Animal a = new Animal();
        a.sound();
        p.sound();
        d.sound();
    }
}
