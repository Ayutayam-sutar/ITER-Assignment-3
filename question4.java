import java.util.*;
public class question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number between 1 to 9");
int a=sc.nextInt();
int comp=1+(int)(Math.random()*10);
if(a==comp){
    System.out.println("You got it right");
}else if(a-comp==1||a-comp==-1){
    System.out.println("Almost got it");
}else{
    System.out.println("You got it wrong");
}

System.out.println(comp);
    }
}
