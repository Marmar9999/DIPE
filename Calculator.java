//Tasks
//1. Create a simple calculator program that prompts the user to enter two numbers. The program should then calculate and display the sum, difference, product, quotient, and remainder of the two numbers.

//2. Develop a console application to collect faculty data from students. The application should prompt the user to enter the faculty name, last grade, last degree, number of subjects, and whether the student passed or not.



import java.util.*;
class Calculator{
    public static void main(String[] args){
        //first we're using scanner to take inputs from user
        Scanner input = new Scanner (System.in);
        System.out.println("please enter the first number");
        double firstNumber = input.nextDouble();
        System.out.println("please enter the second number");
        double secondNumber = input.nextDouble();
        // let user choose an operator
        System.out.println("please enter the operator (+ , - , / , * , % )");
        char operator = input.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println("The Summation: " + (firstNumber + secondNumber) );
                break;
            case '-':
                System.out.println("The Subtraction: " + (firstNumber - secondNumber) );
                break;
            case '*':
                System.out.println("The Multiplication: " + (firstNumber * secondNumber) );
                break;
            case '/':
                System.out.println("The Division: " + (firstNumber / secondNumber) );
                break;
            case '%':
                System.out.println("The Reminder: " + (firstNumber % secondNumber) );
                break;
            default:
                System.out.println("wrong input! ");
        }
    }
}
