import java.util.*;
public class question14 {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer");
int n=sc.nextInt();
if(n%5==0&&n%6==0){
    System.out.println("Is "+n+" divisible by 5 and 6? true");
   
}else{
    System.out.println("Is "+n+" divisible by 5 and 6? False");
}
 if(n%5==0||n%6==0){
System.out.println("Is "+n+" divisible by 5 or 6? true");
    }else{
        System.out.println("Is "+n+" divisible by 5 or 6? False");
    }if(n%5==0&&n%6==0){
        System.out.println("Is "+n+" divisible by 5 or 6,but not both? False");
    }else{
        System.out.println("Is "+n+" divisible by 5 or 6,but not both? True");
    }}}

