import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Q1
/*
        System.out.println("Enter num1");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println("Enter num2");
        Scanner s1 = new Scanner(System.in);
        int num2 = s1.nextInt();
        System.out.println("Enter num3");
        Scanner s2 = new Scanner(System.in);
        int num3 = s2.nextInt();
        System.out.println("Enter num4");
        Scanner s3 = new Scanner(System.in);
        int num4 = s3.nextInt();

        int average = (num1 + num2 + num3 + num4) / 4;
        System.out.println("The average is " + average);
*/
        //Q2

/*
        System.out.println("Enter amount in skekels");
        Scanner m = new Scanner(System.in);
        int am = m.nextInt();
        Double amount_in_dollar = am/3.21;
        System.out.print("  " + "your amount in dollar is");
        System.out.printf("%.2f", amount_in_dollar );
*/
/*
        System.out.println("Enter Your Name: ");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();
        System.out.println("Welcome" + " " +  "\"" + username + "\"" + "  " + "in UCAS");
*/



        System.out.println("Enter Your Year of birth   : ");
        Scanner ybirth = new Scanner(System.in);
        int ybtInt = ybirth.nextInt();
        System.out.print("Your Age in Year" + "  ");
        System.out.println( 2026 - ybtInt);


    }
}
