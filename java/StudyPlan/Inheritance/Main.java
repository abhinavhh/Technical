package StudyPlan.Inheritance;
class Car{
    String brand = "Ford";
    public void sound(){
        System.out.println("woo woo");
    }
}

class Main extends Car{
    private String model = "Mustang";
    public static void main(String args[]){
        Main obj = new Main();
        obj.sound();
        System.out.println(obj.model+" "+obj.brand);
    }
}