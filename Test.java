import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Controller cn = new Controller();
        Calculator cl = new Calculator();
        String op;
        int a;
        int b;

            /* (Для арабских цифр)*/
            System.out.print("Enter 1st num,pls(o-10): ");
            a=sc.nextInt();
            System.out.print("Enter 2nd num,pls(0-10): ");
            b=sc.nextInt();
            System.out.println("a/b = "+cl.div(a, b));
            System.out.println("a*b = "+cl.mult(a, b));
            System.out.println("a-b = "+cl.substr(a, b));
            System.out.println("a+b = "+cl.sum(a, b));
            
            /* (Для римских цифр)*/
            System.out.print("Enter 1st num,pls(I-X): ");
            a=cn.convert(sc.next());
            System.out.print("Enter 2nd num,pls(I-X): ");
            b=cn.convert(sc.next());
            System.out.println(a+"/"+b+" = "+cn.convert(cl.div(a, b)));          
            System.out.println(a+"*"+b+" = "+cn.convert(cl.mult(a, b)));  
            System.out.println(a+"-"+b+" = "+cn.convert(cl.substr(a, b)));  
            System.out.println(a+"+"+b+" = "+cn.convert(cl.sum(a, b)));  
    }
}
