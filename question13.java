import java.util.*;
public class question13 {
    public static void main(String[] args) {
  Random r=new Random();
  int a=r.nextInt(1,13);
  switch (a) {
    case 1:System.out.println("January");break;
    case 2:System.out.println("February");break;
    case 3:System.out.println("Mar");break;
    case 4:System.out.println("Apr");break;
    case 5:System.out.println("May");break;
    case 6:System.out.println("Jun");break;
        case 7:System.out.println("Jul");break;
        case 8:System.out.println("Aug");break;
        case 9:System.out.println("Sept");break;
        case 10:System.out.println("Oct");break;
        case 11:System.out.println("Nov");break;
        case 12:System.out.println("Dec");break;
    default:System.out.println("Itne to mahine bhi nahi hai");
        break;    
  }}}
