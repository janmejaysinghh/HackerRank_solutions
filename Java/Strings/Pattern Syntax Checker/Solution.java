// github.com/RodneyShag

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// If a PatternSyntaxException is not thrown by Pattern.compile, the regular expresion is valid
public class Solution {
    	Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		// Check if there's a next integer to read
        while(testCases>0){
            String pattern = in.nextLine();
              //Write your code
              try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
    }
}
