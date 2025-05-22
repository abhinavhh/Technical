

public class StringSizeOrder {
    public static void main(String[] args){
        // we can sort the string by using nested loop
        String[] fruits = {"apples", "bananas", "orange", "kivi", "chikku"};

        for(int i=0; i < fruits.length - 1 ; i ++){
            for(int j = 0 ; j < fruits.length - i - 1 ; j++){
                if(fruits[j].length() > fruits[j + 1].length()){
                    String temp = fruits[j];
                    fruits[j] = fruits[j + 1];
                    fruits[j + 1] = temp;
                }
            }
        }
        for(String f: fruits){
            System.out.println(f);
        }
    }
}
