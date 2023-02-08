import java.util.Scanner;

class temp
{
    
    public static void main (String[] a)
    {
        int c;
        demo obj=new demo();
        String name[]=new String[44];
        int rollno[]=new int[6];
        String course[]=new String[45];
        Scanner scan=new Scanner(System.in);
        for(int i=1;i<=3;i++)
        {
            System.out.printf("enter the %d student name:-\n",i);
            name[i]=scan.nextLine();
            
            System.out.printf("enter the %d student roll_no:-\n",i);
            rollno[i]=scan.nextInt();
            System.out.printf("enter the %d student course:-\n",i);
            course[i]=scan.nextLine();
            c=obj.sum();
            System.out.println();
            System.out.printf("%d student total marks %d:-\n",i,c);
            
        }
      
       
    }

    
}
class demo
{
    static int total;
public static int sum ()

{
    String java;
    String dw;
    String os;
    String awp;
    int[] sub=new int[24];
    Scanner scanq=new Scanner(System.in);
    for(int i=1;i<=4;i++)

    {
        System.out.printf("enter  subject marks:-");
        sub[i]=scanq.nextInt();

    }

    total=0;
    for(int i=1;i<=4;i++)
    {
    
    total+=sub[i];
    }
    return total;
}


}

