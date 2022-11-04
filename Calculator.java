import java.util.Scanner;
class Calculator {
  public static void main(String args[]) {
    char operator;
    float n1, n2, result;
    Scanner input = new Scanner(System.in);
    System.out.println("Choose an operator +, -, /, *");
    operator = input.next().charAt(0);
    System.out.println("Enter first number : ");
    n1 = input.nextFloat();
    System.out.println("Enter second number : ");
    n2 = input.nextFloat();

    switch (operator) {
    case '+':
      result = n1 + n2;
      System.out.println(n1 + "+" + n2 + "=" + result);
      break;

    case '-':
      result = n1 - n2;
      System.out.println(n1 + "-" + n2 + "=" + result);
      break;

    case '*':
      result = n1 * n2;
      System.out.println(n1 + "*" + n2 + "=" + result);
      break;

    case '/':
      result = n1 / n2;
      System.out.println(n1 + "/" + n2 + "=" + result);
      break;
    default:
      System.out.println("Invalid Operator");
      break;
    }
    input.close();
  }
}