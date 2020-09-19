 import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("첫번째 자리");
    String num1 = sc.next();

    System.out.println("두번째 자리");
    String num2 = sc.next();

    System.out.println("세번째 자리");
    String num3 = sc.next();

    System.out.println( "전화번호" + num1+"-"+num2+"-"+num3);
    
  }
}