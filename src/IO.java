import apcslib.*;
import chn.util.*;
public class IO
{
    static ConsoleIO console = new ConsoleIO(); 
    public static String Input(String str){
        System.out.println("Enter "+str);
        String input = console.readLine();
        return input;
    }
    public static int Inputint(String str){
      System.out.println("Enter "+str);
      int input = console.readInt();
      return input;
    } 
    public static double Inputdouble(String str){
      System.out.println("Enter "+str);
      double input = console.readDouble();
      return input;
    } 
    public static double Inputchar(String str){
      Input(str);
      char input = str.charAt(0);
      return input;
    }
    public static void Output(String str){
        System.out.println(str);
    }
}