/**
 * Created by shruti on 12/8/16.
 */

      import java.util.Scanner;

      public class LoanPayment
      {

      public void SimpleLoan()
    {
        double rate;

        double monthlyPayment=50;
        double b=1000;
        Scanner CONSOLE = new Scanner(System.in);
        System.out.println("One Year Loan Table");
        System.out.println();
        System.out.println("Enter the annual interest rate :");
        rate = (CONSOLE.nextDouble())/100;

        System.out.println("The initial loan is "+"$"+b);
        System.out.println("The monthly payment is "+"$"+monthlyPayment);
        System.out.println("The annual interest rate is"+(rate*100));
        System.out.println("Simple Loan Payment Table For One Year");
        System.out.println("MONTH     BALANCE");

                for(int i=1;i<=12;i++)
                {
                    b = (b + b*(rate/12))-monthlyPayment;
                    System.out.println(i+"         "+b);
                }
    }
       public void DetailedLoan()
       {
           double balance;
           double irate;
           double monthlypayment;
           int months;
           double remaining;
           Scanner CONSOLE = new Scanner(System.in);
           System.out.println("Detailed Loan Table");
           System.out.println("Enter initial balance:");
           balance=CONSOLE.nextDouble();
           System.out.println("Enter the annual initial rate percentage");
           irate=CONSOLE.nextDouble();
           System.out.println("Enter the monthly Payment");
           monthlypayment=CONSOLE.nextDouble();
           System.out.println("Enter no of months");
           months=CONSOLE.nextInt();
           System.out.println("The initial loan is "+"$"+balance);
           System.out.println("The monthly payment is "+"$"+monthlypayment);
           System.out.println("The annual interest rate is"+irate);

               for(int i=1;i<=months;i++)

           {
               System.out.println("MONTH     BALANCE                     PAYMENT       REMAINING");
               balance = (balance + balance*(irate/1200));
               remaining =balance-monthlypayment;
               System.out.println(i+"         "+balance+"                     " + monthlypayment + "        " + remaining);
               balance=balance-monthlypayment;
           }
       }
            public static void main(String args[])
            {
                System.out.println("PROJECT THREE written by shruti");
                LoanPayment lp=new LoanPayment();
                lp.SimpleLoan();
                lp.DetailedLoan();
            }


  }
