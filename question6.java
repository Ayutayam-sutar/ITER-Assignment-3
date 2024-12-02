import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter unit of electric bill");
int u=sc.nextInt();
if(u<=50){
int price1=u*3;
System.out.println("Bill="+price1);
}else if(u>50&&u<=200){
    int price2=(int)(50*3+(u-50)*4.80);
    System.out.println("Bill="+price2);
}else if(u>200&&u<=400){
    int price3=(int)(50*3+150*4.80+(u-200)*5.80);
    System.out.println("bill="+price3);
}else{
    int price4=(int)(50*3+150*4.80+200*5.80+(u-400)*6.20);
    System.out.println("bill="+price4);
}







    }}