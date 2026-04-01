
import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        // create variales using double fir num 1 and 2 and scan input.
        double num1;
        // scan input
        System.out.println("input num 1: ");
        Scanner input_1 = new Scanner(System.in);
        num1 = input_1.nextDouble();
        double num2;
        System.out.println("input num 2: ");
        Scanner input_2 = new Scanner(System.in);
        num2 = input_2.nextDouble();
        
        // getting the operator from the user
        System.out.println("input operator: (+, -, *, /)");
        Scanner input_operator = new Scanner(System.in);
        String operator;
        operator = input_operator.nextLine();
        // write an if statement to confirm operator
        //if (operator == "+" || operator == "-" || operator == "*" || operator == "/"){

            switch(operator){
                case "+":
                    System.out.println("your answer is : " +  (num1 + num2));
                    break;
                    
                case "-":
                    System.out.println("your answer is : " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("your answer is : " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("your answer is : " + (num1 / num2));
                    break;

            }

        }
       /* else{
            System.out.println("invalid operator");
            //return;
        }*/

    }
