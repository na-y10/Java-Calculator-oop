import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



//--------------------------------------------
 // My Name : Nasser Khaled
// Number : 33
// CS
// ---------------------------------------------



public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number 1 : ");
        int num1 = input.nextInt();

        System.out.println("Please enter number 2: ");
        int num2 = input.nextInt();


        Calculator calc = new Calculator();

        calc.number1 = num1;
        calc.number2 = num2;

        System.out.println("\n-----Results----");
        System.out.println("Sum =  " + calc.sum());
        System.out.println("Subtraction  =  " + calc.subtract());
        System.out.println("Multiplication  =  " + calc.multiply());
        System.out.println("Division  =  " + calc.divide());

        input.close();


    }
}