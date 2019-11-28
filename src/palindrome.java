//import chn.util.*;
//import apcslib.*; 
public class palindrome
{
    static boolean running = false;
    public static boolean PaliReverse(String str){
        //IO io = new IO();
        String input;
        //input = IO.Input("Palindrome candidate?");
        //String almostpalcan = input;
        String palcan0 = str.toLowerCase().replaceAll("[^a-z]","");
        //String palcan0 = almostpalcan.toLowerCase();
        StringBuilder palcan = new StringBuilder();
        palcan.append(palcan0);
        //System.out.println(palcan);
        StringBuilder palcan1 = new StringBuilder();
        palcan1 = palcan.reverse();
        String palcan2 = palcan1.toString();
        //System.out.println(palcan1);        
        boolean running = true;
        if (palcan0.equals(palcan2)){
            //IO.Output("This is Palindrome");
        }else{
            running = false;
            //IO.Output("Not Palindrome");
        }
        return running;
    }
    public static boolean PaliIandJ(String str){
        //IO io = new IO();
        String input;
        //input = IO.Input("Palindrome candidate?");
        //String almostpalcan = input;
        String palcan = str.toLowerCase().replaceAll("[^a-z]","");
        int i = 0;
        int j = palcan.length() -1;
        boolean isPal =  true;
        while (i < j) {
            if (palcan.charAt(i) != palcan.charAt(j)){
                isPal = false;
            }
            i++;
            j--;
        }
        return isPal;
    }
    public void PaliRecurse(){
        //IO io = new IO();
        String input;
        //input = IO.Input("Palindrome candidate?");
        //String almostpalcan = input;
        //String string = string.toLowerCase().replaceAll("[^a-z]","");
        //io.Output(palcan);
        //isPal(palcan);
    }
    public static boolean isPal(String str){
        //static boolean running = false;
        String string = str.toLowerCase().replaceAll("[^a-z]","");
        //System.out.println(string);
        //IO io = new IO();        
        int i = 0;
        int j = string.length() -1;
        if (string.length() == 0 || string.length() == 1){
            //IO.Output("This is a Palindrome");
        	//System.out.println(string);
        	running = true;
        }else{
            if (string.charAt(i) != string.charAt(j)){
                //IO.Output("This isn't a palindrome");
                running = false;
            }else{
                string = string.substring(i+1,j);
                isPal(string);
            }
        }
        //System.out.println(running);
        return running;
    }
}
