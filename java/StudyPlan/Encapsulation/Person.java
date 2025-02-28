package StudyPlan.Encapsulation;

// Encapsulation is used to hide sensitive data from users 

class Encapsulation{
    
    private String name = "John"; // string is private 

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class Person{
    public static void main(String args[]){
        
        Encapsulation obj = new Encapsulation();

        // below line will give error
        // System.out.println("Name is : "+obj.name ); 

        // below code is the correct one
        System.out.println("Name is : "+obj.getName()); // Get and Set method is used to access the attributes
    }
}