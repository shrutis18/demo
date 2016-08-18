import java.util.Scanner;

public class Pat {


	public static void DrawHorizontal(int box)
    {
        for (int j = 1; j <= box; j++) {
            System.out.print("+");
            for (int i = 0; i <= 3; i++)
                System.out.print("-");
        }
            System.out.println("+");


    }


     public static void Drawboxes(int box)

     {

              DrawHorizontal(box);

         for(int j = 0 ; j <= box ; j++)
           {
             System.out.print("|    ");

           }
             System.out.println("");

         for(int j = 0 ; j <= box ; j++)
         {
             System.out.print("|    ");

         }
                System.out.println("");
                DrawHorizontal(box);
     }

     public static void pentagon(int h,int w)
      {
         for (int i = 0; i < w; i++)
                System.out.print(" __   ");

         for (int k = 0; k < h; k++)
         {
                System.out.print("\n");
             for (int j = 0; j < w; j++)
                 System.out.print("/  \\__");

                 System.out.print("\n");

             for (int j = 0; j < w; j++)
                 System.out.print("\\__/  ");
         }
     }	


	public static void main(String[] args)
	{
		int boxes,height,width;
                System.out.println("Project ONE created by shruti");
                System.out.println("Enter no of Boxes");
                Scanner CONSOLE =new Scanner(System.in);
                boxes=CONSOLE.nextInt();
                
                Pat.Drawboxes(boxes);//calling boxes function
                System.out.println("Enter height");//taking input from the user
                height=CONSOLE.nextInt();
                System.out.println("Enter width");
                width=CONSOLE.nextInt();
                Pat.pentagon(height,width);//calling pentagon function

	}
}
