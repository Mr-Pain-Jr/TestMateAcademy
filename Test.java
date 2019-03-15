import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Controller cn = new Controller();
        Calculator cl = new Calculator();
        String op;
        int a;
        int b;

            /*System.out.print("Enter 1st num,pls(o-10): ");
            a=sc.nextInt();
            System.out.print("Enter 2nd num,pls(0-10): ");
            b=sc.nextInt();
            System.out.println(cl.div(a, b));*/
            
            System.out.print("Enter 1st num,pls(o-10): ");
            a=cn.compare(sc.next());
            System.out.print("Enter 2nd num,pls(0-10): ");
            b=cn.compare(sc.next());
            System.out.println(cn.compare(cl.div(a, b)));            
    }
}
