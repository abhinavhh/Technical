package StudyPlan.Interface;

interface First{
    public void sound1();
}

interface Second{
    public void sound2();
}

class Pig implements First, Second{
    public void sound1(){
        System.out.println("First");
    }
    public void sound2(){
        System.out.println("Second");
    }
}
public class MultipleInterface {
    public static void main(String[] args){
        Pig p = new Pig();
        p.sound1();
        p.sound2();
    }
}
