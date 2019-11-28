
import chn.util.ConsoleIO;
public class PigLatinator
{
     public static boolean hasVow(char[] word)
     {
        // e.g. Hasta
        for (int i=0; i< word.length; i++) {
            if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' 
               || word[i] == 'o'|| word[i] == 'u' )
            {
                return true;
            }
        }
        
        return false;
     }
    
     public static boolean begHasVow(char first)
     {
        if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || 
            first == 'u')
            {
                return true;
            }
        
        return false;
     }
    
     public static String remove1st(char[] word)
     {
        char[] removed = new char[word.length];
        
        for (int i=1; i<word.length; i++)
        {
            // word[0] 
            // word[1] --> removed[0]
            // word[2] --> removed[1]
            removed[i-1] = word[i];
        }
        return new String(removed);
     }
    
     public static void latinator () 
     {
       
        System.out.println("Welcome to the PigLatin Converter!");
        System.out.print("Enter a phrase: ");
       
        ConsoleIO console = new ConsoleIO();
        String str = console.readLine();
       
        String[] splitted = str.split("\\s+|.");
//       for (int i=0;i<splitted.length;i++) {
 //       System.out.println(splitted[i] + " ");
 //       }
 //       System.out.println("Ignore");
        int length = splitted.length;
        String finalString = new String();
  
        for (int i = 0; i < length; i++)
        {   
            char[] characters = splitted[i].toCharArray();
            if (PigLatinator.hasVow(characters))
            { 
               if (PigLatinator.begHasVow(characters[0])) {
                   String s = new String(characters);
                   finalString += s + "yay" + " ";
               }
               else {
                   finalString += PigLatinator.remove1st(characters) + 
                    Character.toString(characters[0]) + "ay" + " ";
               }
           }
           else {
               String s = new String(characters);
               finalString += s +"ay" + " ";
            }
        }
       
       System.out.println(finalString);
     }
     
     //temporary fake methods for MethodSearch to search
     public static void vowel () {
         
     }
     
     public static void noVowel() {
         
     }
}
