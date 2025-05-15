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
        Animal a = new Dog();
        a.sound();
        a = new Pig();
        a.sound();
        a = new Animal();
        a.sound();
    }
}
