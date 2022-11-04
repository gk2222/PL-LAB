import java.util.*;
abstract class shape {
  int dim1, dim2;
  double area;
  abstract void calcarea();
  Scanner sc = new Scanner(System.in);
}
class rectangle extends shape {
  rectangle() {
    System.out.print("Enter length:");
    dim1 = sc.nextInt();
    System.out.print("Enter braedth:");
    dim2 = sc.nextInt();
  }
  void calcarea() {
    area = dim1 * dim2;
    System.out.print("Area of rectangle=" + area);
  }
}
class triangle extends shape {
  triangle() {
    System.out.print("\nEnter base:");
    dim1 = sc.nextInt();
    System.out.print("Enter height:");
    dim2 = sc.nextInt();
  }
  void calcarea() {
    area = 0.5 * dim1 * dim2;
    System.out.print("Area of triangle=" + area);
  }
}
class HI {
  public static void main(String args[]) {
    rectangle rect = new rectangle();
    rect.calcarea();
    triangle tri = new triangle();
    tri.calcarea();
  }
}