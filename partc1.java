import java.util.Scanner;
interface Shapes
{
    void area();
}
class circle implements Shapes
{
    double r;
    circle(double r)
    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("Area of the Circle:"+(3.14*r*r));
    }
}
class square implements Shapes
{
    double s;
    square(double r)
    {
        this.s=s;
    }
    public void area()
    {
        System.out.println("Area of the squre:"+(s*s));
    }
}
class rectangular implements Shapes
{
    double l,b; 
    rectangular(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        System.out.println("Area of the rectangular:"+(l*b));
    }
}
public class partc1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("---AREA CALCULATOR MENU----");
        System.out.println("1.circle");
        System.out.println("2.square");
        System.out.println("3.rectangular");
        System.out.println("4.exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        Shapes shape;
        switch(choice)
        {
            case 1:
                System.out.println("Enter the readius:");
                double r=sc.nextDouble();
                
        }
    }
}
