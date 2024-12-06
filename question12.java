import java.util.Scanner;
public class question12 {
    public static void main(String args[]){
         Scanner sc=new Scanner (System.in);
      System.out.println("Enter today day");
int a=sc.nextInt();
switch (a) {
    case 0:System.out.println("Sunday");break;
    case 1:System.out.println("Monday");break;
    case 2:System.out.println("Tuesday");break;
    case 3:System.out.println("Wednesday");break;
    case 4:System.out.println("Thusday");break;
    case 5:System.out.println("Friday");break;
    case 6:System.out.println("Saturday");break;
    default:System.out.println("Itne to din bhi nahi hai");
        break;
    }  System.out.println("Enter the  number of days elasped since today");
int b=sc.nextInt();
int logic=(b+a)%7;
switch (logic) {
    case 0:System.out.println("Sunday");break;
    case 1:System.out.println("Monday");break;
    case 2:System.out.println("Tuesday");break;
    case 3:System.out.println("Wednesday");break;
    case 4:System.out.println("Thusday");break;
    case 5:System.out.println("Friday");break;
    case 6:System.out.println("Saturday");break;
    default:System.out.println("Itne to din bhi nahi hai");
        break;}}}
