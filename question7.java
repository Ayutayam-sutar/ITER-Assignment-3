import java.util.*;
public class question7 {
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter you units");
int u=sc.nextInt();
if(u<=50){
    int price1=u*3;
    System.out.println("No of units consumed: "+u);
    System.out.println("Bill: "+price1);
    System.out.println("Do you want to pay online( true/false):");
   Boolean s=sc.nextBoolean();
    if(s==true){
System.out.println("Total amount:"+price1);
double discount1=(double)price1*3/100;
System.out.println("Discount:"+discount1);
double total1=price1-discount1;
System.out.println("Amount payable:"+total1);
    }else{
        System.out.println("Amount payable:"+price1);
    }
    }else if(u>50&&u<=200){
        int price2=(int)(50*3+(u-50)*4.80);
        System.out.println("Bill: "+price2);
        System.out.println("No of units consumed: "+u);
        System.out.println("Do you want to pay online( true/false):");
       Boolean s=sc.nextBoolean();
        if(s==true){
    System.out.println("Total amount:"+price2);
    double discount1=(double)price2*3/100;
    System.out.println("Discount:"+discount1);
    double total1=price2-discount1;
    System.out.println("Amount payable:"+total1);
        }else{
            System.out.println("Amount payable:"+price2);
        }
    }else if(u>200&&u<=400){
        int price3=(int)(50*3+150*4.80+(u-200)*5.80);
        System.out.println("Bill: "+price3);
        System.out.println("No of units consumed: "+u);
        System.out.println("Do you want to pay online( true/false):");
       Boolean s=sc.nextBoolean();
        if(s==true){
    System.out.println("Total amount:"+price3);
    double discount1=(double)price3*3/100;
    System.out.println("Discount:"+discount1);
    double total1=price3-discount1;
    System.out.println("Amount payable:"+total1);
        }else{
            System.out.println("Amount payable:"+price3);
        }
    }else{
        int price4=(int)(50*3+150*4.80+200*5.80+(u-400)*6.20);
        System.out.println("Bill: "+price4);
        System.out.println("No of units consumed: "+u);
        System.out.println("Do you want to pay online( true/false):");
       Boolean s=sc.nextBoolean();
        if(s==true){
    System.out.println("Total amount:"+price4);
    double discount1=(double)price4*3/100;
    System.out.println("Discount:"+discount1);
    double total1=price4-discount1;
    System.out.println("Amount payable:"+total1);
        }else{
            System.out.println("Amount payable:"+price4);
        }
    }
      
    }
}
