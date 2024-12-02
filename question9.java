import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
          Scanner sc=new Scanner (System.in);
      System.out.println("Enter three numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b&&b>c){
System.out.println("Largest number: "+a);
System.out.println("Second largest no: "+b);
}else if(b>a&&a>c){
System.out.println("Largest number: "+b);
System.out.println("Second largest no: "+a);
}else if(c>b&&b>a){
System.out.println("Largest number: "+c);
System.out.println("Second largest no: "+b);
}else if(a>c&&c>b){
    System.out.println("Largest number: "+a);
    System.out.println("Second largest no: "+c);
    }else if(b>c&&c>a){
        System.out.println("Largest number: "+b);
        System.out.println("Second largest no: "+c);
        } else if(c>a&&a>b){
            System.out.println("Largest number: "+c);
            System.out.println("Second largest no: "+a);
            }else {
                System.out.println("all are equal");
            }
    }
}
