import java.util.*;
public class question11 {
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
Random r=new Random();
System.out.println("Enter for Scissor(0),Rock(1),Paper(2)");
int user=sc.nextInt();
int comp=r.nextInt(0,3);
if(comp==user){
    System.out.println("The computer is "+r+". You r "+user+"too"+". It is a draw");
}else if(comp==2&&user==0){
System.out.println("The computer is paper .You r sccisor .You won");
}else if(comp==2&&user==1){
    System.out.println("The computer is paper.You r rock  .You lose");
}else if(comp==1&&user==2){
    System.out.println("The computer is rock.You r paper  .You won");
    }else if(comp==1&&user==0){
        System.out.println("The computer is rock .You r scissor .You lose");
    }else if(comp==0&&user==2){
        System.out.println("The computer is Scissor.You r paper .You lose");
        }else if(comp==0&&user==1){
            System.out.println("The computer is Scissor .You r rock .You won");
        }else{
        System.out.println("Invalid number");
    }





    }
}
