import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b&&b>c) {
            System.out.println("Decreasing");
        } else if (c>b&&b>a){
          System.out.println("Increasing");  
        }else{
            System.out.println("Neither increasing nor decreasing");
        }
    }
}
