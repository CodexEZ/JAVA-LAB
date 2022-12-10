
import java.util.*;
public class WordCheck {
    public static void checkWord(String word){
        String[] check = word.split(" ");
        if(check.length>1){
            throw new ArrayIndexOutOfBoundsException("More than one word in input");
        }

    }
    public static void findFreq(String str){
        int[] freq = new int[str.length()];  
        int i, j; 
        char string[] = str.toCharArray();  
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                    string[j] = '0';  
                }  
            }  
        }  
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(string[i] + "-" + freq[i]);  
        }  
    }
    public static void main(String[] args) {
        String word;
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter a word");
        word = sc.nextLine();
        sc.close();
        word =word.trim();
        try{
            checkWord(word);
            findFreq(word);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }
    
}
