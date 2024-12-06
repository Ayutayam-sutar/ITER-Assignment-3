import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
      System.out.println("Enter two coordinate");
double x=sc.nextDouble();
double y=sc.nextDouble();
if(x<0&&y<0){
System.out.println(x+","+y+" is in qudrant 3");
}else if(x>0&&y>0){
    System.out.println(x+","+y+" is in qudrant 1");
}else if(x<0&&y>0){
System.out.println(x+","+y+" is in qudrant 2");
}else if(x>0&&y<0){
System.out.println(x+","+y+" is in qudrant 4");
}else if(x==0&&y>0||y<0){
System.out.println(x+","+y+" is in on y axis");
}  
else if(y==0&&x>0||x<0){
    System.out.println(x+","+y+" is in on x axis");
}else{
    System.out.println("It is origin");
}






    }
}
