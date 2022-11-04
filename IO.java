import java.io.*;
import java.util.*;
class Student {
  int RollNo;
  String name;
  String Dept;
  Double cgpa;
  Student() {
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter Roll No:");
    RollNo = sc1.nextInt();
    System.out.print("Enter Name:");
    name = sc1.next();
    System.out.print("Enter Department name:");
    Dept = sc1.next();
    System.out.print("Enter cgpa:");
    cgpa = sc1.nextDouble();
  }
}
class func {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    String s;
    File f1 = new File("studentData.txt");
    f1.createNewFile();
    OutputStream fos = new FileOutputStream(f1, true);
    PrintStream ps = new PrintStream(fos);
    Student stu1 = new Student();

    ps.print("" + stu1.RollNo);
    ps.print("\t" + stu1.name);
    ps.print("\t" + stu1.Dept);
    ps.println("\t\t" + stu1.cgpa);
    System.out.print("Record inserted successfully!");
    fos.close();
    ps.close();
  }
}