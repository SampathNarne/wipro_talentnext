import java.util.*;
class NumberCheck{
    public static void main(String[] args){
        int n=0;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
                // System.out.println("You entered: " + input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer input!");
                return;
            }
        } else {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }
        if(n > 0){
            System.out.println("Given number is a Positive Number");
        } else if(n < 0){
            System.out.println("Given number is a Negative Number");
        } else{
            System.out.println("Given number is zero");
        }
    }
}