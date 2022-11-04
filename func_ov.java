import java.util.Scanner;
class func_ov {
  static void area(int l, int b) {
    System.out.println("Area of Rectangle is : " + l * b);
  }

  static void area(int s) {
    System.out.println("Area of Square is : " + s * s);
  }

  static void area(double s) {
    System.out.println("Area of Circle is : " + 3.14 * s * s);
  }

  static void area(double h, double b) {
    System.out.println("Area of Triangle is : " + (h * b) / 2);
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1.Rectangle\n2.Square\n3.Circle\n4.Triangle\n");
    int c = 5;
    while (c != 0) {
      System.out.println("Enter Your Choice : ");
      c = sc.nextInt();

      switch (c) {
      case 1:
        System.out.println("For Rectangle : ");
        System.out.println("L and B : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        area(l, b);
        break;

      case 2:
        System.out.println("For Square : ");
        System.out.println("Side : ");
        int s = sc.nextInt();
        area(s);
        break;

      case 3:
        System.out.println("For Circle : ");
        System.out.println("Radius");
        double r = sc.nextInt();
        area(r);
        break;

      case 4:
        System.out.println("For Triangle : ");
        System.out.println("H and B : ");
        double h = sc.nextInt();
        double bs = sc.nextInt();
        area(h, bs);
        break;
      }
    }
  }
}