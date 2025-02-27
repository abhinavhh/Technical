package StudyPlan.Modifiers;

public class FinalModifier{
    final int x = 5;
    final double PI = 3.14;
    
    public static void main(String args[]){
        FinalModifier obj = new Main();
        obj.x = 50; // shows error because x is declared as final : cannot assign a value to final variable
        obj.PI = 3.1114; // error : cannot assign a value to a final variable
    }
}