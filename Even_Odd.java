import java.util.Scanner;
class number {
  void func(int n) {
    if (n % 2 == 0)
      System.out.println("It's a EVEN Number");
    else
      System.out.println("It's a ODD Number");
  }
}

class Even_Odd {
  public static void main(String args[]) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = s1.nextInt();
    number n1 = new number();
    n1.func(n);
  }
}