package StudyPlan.Interface;
interface Animal{
    public void sound();
}
class Pig implements Animal{
    public void sound(){
        System.out.println("Pig Sound");
    }
}
public class Main {
    public static void main(String[] args){
        Pig p = new Pig();
        p.sound();
    }
}
