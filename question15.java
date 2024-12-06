import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your gender(M or F)");
        char gender=sc.next().charAt(0);
        System.out.println("First name ");
        String fname=sc.next();
        System.out.println("Last name ");
        String lname=sc.next();     
System.out.println("Age");
int age=sc.nextInt();

//female
if (gender=='F'||gender=='f') {
    if(age<20){
        System.out.println("Then i shall call you  "+fname+" "+lname);
    }else{
    System.out.println("Are you married(y or n)");
char marr=sc.next().charAt(0);
    if(marr=='y'||marr=='Y'){
System.out.println("Then i shall call you Mrs "+fname+" "+lname);
    }else if(marr=='n'||marr=='N'){
        System.out.println("Then i shall call you Ms "+fname+" "+lname);
    }}
    //male
}else if(gender=='M'||gender=='m'){
 if (age>=20) {
    System.out.println("Then I shall call you Mr "+fname+" "+lname);
 }else{
System.out.println("Then I shall call you "+fname+" "+lname);}}}}
