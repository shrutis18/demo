import java.util.Scanner;


        public class MetricConversion {


            public void KiloToPounds()
            {

                 Scanner CONSOLE= new Scanner(System.in);
                 int low;
                 int high;
                 double pounds;

                System.out.println("Enter the lower range");

                low=CONSOLE.nextInt();
                System.out.println("Enter the higher range");
                high=CONSOLE.nextInt();
                System.out.println("KILOGRAM     POUNDS");
                        for(int i=low;i<=high;i++)
                        {
                            System.out.print(i  +"           ");
                            pounds=i / 0.45359237;
                            System.out.printf("%4f",pounds);
                            System.out.println("");
                        }

            }
            public void FeetToMetres()
            {
                Scanner CONSOLE =new Scanner(System.in);
                System.out.println("\n");
                System.out.println("\t     Inches\t");
                System.out.println("\n");
                System.out.println("feets    ");

                                for(int i = 0;i <=11 ;i++)
                                {
                                    System.out.printf(i+"\t         ");
                                }
                                    System.out.println("\n");

                                for(int i = 0;i <= 9;i++){
                                    System.out.println(i);
                                    for(int j = 0;j <= 11; j++)
                                        System.out.printf("\t     %.4f",((i*12)+j)*0.0254);

                                        System.out.println("\n");

            }


            }


            public static void main(String args[])
            {
                System.out.println("Project 2 written by shruti ");

                MetricConversion mc =new MetricConversion();
                System.out.println("Conversion of kilogram to pounds");
                mc.KiloToPounds();
                System.out.println("Conversion of feet and inches to metres");
                mc.FeetToMetres();
             }
   }