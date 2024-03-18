import java.util.Scanner;
class A
{
    int a,b;
    Scanner Sc=new Scanner(System.in);
    void add()
    {
        System.out.println("enter two numbers to add:");
    }    
}
class B extends A
{
    int p,q;
    Scanner Sc=new Scanner(System.in);
    void sub()
    {
        System.out.println("enter two numbers to sub:");
        p=Sc.nextInt();
        q=Sc.nextInt();
        int r=p+q;
        System.out.println("result of class_B="+r);
    }    
}    
class Main
{
    public static void main(String args[])
    {
     B b1=new B();
     b1.add();
     b1.sub();
    }
}


