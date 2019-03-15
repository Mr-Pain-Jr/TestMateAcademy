
public class Calculator {
    
    public Calculator(){
        System.out.println("I'm here to help you");
    } 
    
    public int count(int a,int b, String op){
        int res=0;
        if(op=="+"){
            res=a+b;
        }
        if(op=="-"){
            res=a-b;
        }
        if(op=="*"){
            res=a*b;
        }
        if(op=="/"){
            res=a/b;
        }
        
        return res;
    }
}
