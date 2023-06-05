//import java.util.Scanner; 
public class Main {
    public static int getShortestWordLength(String sentence) {
        
        String[] words = sentence.split(" ");

    
        int shortestLength = words[0].length();

       
        for (int i = 1; i < words.length; i++) {
            
            if (words[i].length() < shortestLength) {
                shortestLength = words[i].length();
            }
        }

        return shortestLength;
    }

    public static void main(String[] args) {
        String sentence = "This is a test sentence";
        int shortestLength = getShortestWordLength(sentence);
        System.out.println("The length of the shortest word is: " + shortestLength);
    }
}