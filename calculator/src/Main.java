import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) { //behet run vet dmth nuk ndodh vetm nje here veprimi por deri sa ta ndalojme ne
            System.out.println("Advanced calculator");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction(-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println(" 5. Square Root ( )");
            System.out.println("6. Memory Functions ");
            System.out.println("7. Exit ");
            System.out.println("Select (1/2/3/4/5/6/7)");
            double result = 0.0;
            int userChoice = scan.nextInt();
            if (userChoice == 7 || userChoice == 6) {
                if (userChoice == 7) {
                    System.out.println("Exit");
                } else if (userChoice == 6) {
                    handleMmeoryFunctions(scan, calculator);

                }
            } else {
                System.out.println("Put the first num: ");
                double a = scan.nextDouble();
                System.out.println("Put the second num: ");
                double b = scan.nextDouble();
                if (userChoice == 1) {
                    System.out.println("Addition (+)");
                    result = calculator.add(a, b);
                    System.out.println("Shuma eshte" + result);


                } else if (userChoice == 2) {
                    System.out.println(" Subtraction(-) ");
                    result = calculator.subtract(a, b);
                    System.out.println("Diferenca eshte" + result);

                } else if (userChoice == 3) {
                    System.out.println("Multiplication (*) ");
                    result = calculator.multiplication(a, b);
                    System.out.println("shumezimi del " + result);
                } else if (userChoice == 4) {
                    System.out.println("Division (/) ");
                    result = calculator.division(a, b);
                    System.out.println("Pjestimi del " + result);
                } else if (userChoice == 5) {
                    System.out.println("Square Root ( )");
                    result = calculator.square(a);
                    System.out.println("rrenja katrore eshte  " + result);

                } else {
                    System.out.println("Invalid function. Please select a valid function");
                }
            }

        }
    }

    public static void handleMmeoryFunctions(Scanner scan, Calculator calculator) {
        System.out.println("Memory Functions: ");
        System.out.println("1.Add to memory (M+) ");
        System.out.println("2.Clear Memory(MC) ");
        System.out.println("3.Recall Memory (MR) ");
        System.out.println("Select (1/2/3) ");

        System.out.println("Memory Functions");
        int memoryChoice = scan.nextInt();
        switch (memoryChoice) {
            case 1:
                System.out.println("Add to Memory");
                break;
            case 2:
                System.out.println("clear memory");
                break;
            case 3:
                System.out.println("Recall memory");
                break;
            default:
                System.out.println("Invalid memory function.");
        }
    }


}



