import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
      System.out.println("Enter your marks 0 to 100");
int a=sc.nextInt();
if(a>=0&&a<=100){
        switch(a/10){
            case 10:System.out.println("O");
            break;
            case 9:System.out.println("O");
            break;
            case 8:System.out.println("A");
            break;
            case 7:System.out.println("B");
            break;
            case 6:System.out.println("C");
            break;
            case 5:System.out.println("D");
            break;
            case 4:System.out.println("E");
            break;
            case 3:System.out.println("F");
            break;
            default:System.out.println("F");
            }
        }
    }
}
