
    import java.util.Scanner;

    public class ArrayProblems {


        public static int hammingDistance(int[] aList, int[] bList)
        {
            int count=0;
            for(int i=0;i<aList.length;i++)
            {
                if(aList[i]!=bList[i])
                    count++;
            }
            return count;
        }


                public static void main(String args[])
                {
                    int size;
                     int dist;
                     Scanner scan= new Scanner(System.in);
                    System.out.println("enter size of array");
                    size=scan.nextInt();
                    int [] aList= new int[size];
                    int [] bList= new int[size];

                             System.out.println("enter first array");
                                for(int i=0;i<size;i++)
                                aList[i]=scan.nextInt();//take first array as input
                                       for(int i:aList)
                                       System.out.println(i);//print the first array
                                System.out.println("enter second array");
                                    for(int i=0;i<size;i++)
                                        bList[i]=scan.nextInt();
                                            for(int i:bList)
                                           System.out.println(i);
                   dist=    ArrayProblems.hammingDistance(aList,bList);
                System.out.println("Hamming Distance is "+dist);

                }
}
