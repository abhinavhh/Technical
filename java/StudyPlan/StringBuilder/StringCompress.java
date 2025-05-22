import java.util.Scanner;

class StringCompress{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        int characterCount = 1;
        StringBuilder result = new StringBuilder();

        for(int i = 1; i < inputString.length(); i++){
            if(inputString.charAt(i) == inputString.charAt(i - 1)){
                characterCount++;
            }
            else{
                result.append(inputString.charAt(i - 1)).append(characterCount > 1 ? characterCount : "");
                characterCount = 1;
            }
        }
        result.append(inputString.charAt(inputString.length() - 1)).append(characterCount > 1 ? characterCount : "");
        System.out.println(result);
    }
}