package StudyPlan.Modifiers;

public class StaticModifier {
    
    // static method
    static void staticMethod(){
        System.out.println("Static method can be called without using object");
    }

    // public method
    public void publicMethod(){
        System.out.println("Public method needs object to call ");
    }

    // main method

    public static void main(String args[]){
        staticMethod(); // create no error

        // publicMethod(); //create error

        StaticModifier obj = new StaticModifier();
        obj.publicMethod(); // create no error
    }
}
