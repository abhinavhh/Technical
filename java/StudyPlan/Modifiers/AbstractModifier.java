package StudyPlan.Modifiers;

abstract class AbstractModifier { // abstract class
    
    public String name = "John";
    public int age = 20;
    public abstract void study();// abstract method does not specifies a body

    public static void main(String args[]){
        Student obj = new Student();
        obj.study();
    }
}
class Student extends AbstractModifier{
    public int year = 2025;
    public void study(){
        System.out.println("This is the text from abstract method");
    }
    
}

