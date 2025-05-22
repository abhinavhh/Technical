import java.util.Scanner;

public class StringCharCount {
    public static void main(String[] args){

        // read a string from input
        Scanner s = new Scanner(System.in);
        String inpuString = s.nextLine();

        //Create a empty string to store result
        String result = "";

        //create a variable to store charcter count initialize it with 1 ( default )
        int count = 1;

        //loop thorugh each character in the string starting from second character
        for(int i = 1 ; i < inpuString.length(); i++){
            
            //check if two adjacent string is equal or not if true increase count else store result
            if(inpuString.charAt(i) == inpuString.charAt(i - 1)){
                count++;
            }
            else{

                //append result by cocantenation of string with count
                result = result + inpuString.charAt(i - 1);

                //append count only if it is greater than 1.
                if(count > 1)
                    result = result + count;
                //current count is stored so change it to default
                count = 1;
            }
        }

        //now last letter is remaining as we are using i - 1 to store character, so concatenate last character also with its count
        //character and its count is stored only when there exist another letter which is not equal to current character.
        //So last letter remains there without storing with its count, thats why we manually store it outside the loop.

        result = result + inpuString.charAt(inpuString.length() - 1);
        if(count > 1)
            result = result + count;
        System.out.println(result);
    }
}
