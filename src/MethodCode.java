
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class MethodCode
{
    public static String getMethodCode(String method)
    {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("src/PigLatinator.java"));
        }
        catch (FileNotFoundException e){}
        
        //Scanner reads every line and adds to ArrayList Lines
        ArrayList<String> lines = new ArrayList<String>();
        while (sc.hasNextLine())
        {
            lines.add(sc.nextLine());
        }
        
        //whether the method name is found or not
        boolean method_found = false;
        //counts number of brackets
        int bracket = 0;
        StringBuffer output = new StringBuffer();
        for (int j=0; j<lines.size(); j++)
        {   //checks if opening curley bracket is on the same line as method
            if (method_found == false && lines.get(j).contains(method)) {
                method_found = true;
                output.append(lines.get(j) + "\n");
                if (lines.get(j).contains("{")) {
                    bracket += 1;
                }
            }
            //checks if sequential line has opening curely bracket
            else if (method_found && lines.get(j).contains("{")) {
                bracket += 1;
                output.append(lines.get(j) + "\n");
            }
            //if line contains closing bracket, bracket decreases by one. (only if bracket is 
            //positive to begin with)
            else if (method_found && lines.get(j).contains("}") && (bracket >= 1)) {
                bracket -= 1;
                output.append(lines.get(j) + "\n");
            }
            //if line does not contain bracket, but bracket is still positive, the line is printed
            else if (method_found && bracket >= 1) {
            	output.append(lines.get(j) + "\n");
            }
            //Once bracket = 0, the full method is found
            else if (method_found && bracket == 0) {
                break;
            }
        }
        return output.toString();
    }
}

