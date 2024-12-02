import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter water drank today in ml ");
        int ml=sc.nextInt();
        if(ml<=5000){
            System.out.println("No, Alice is not following doctor's advice");
        }else{
            System.out.println("Yes, Alice is following doctor's advice");
        }


    }
}
