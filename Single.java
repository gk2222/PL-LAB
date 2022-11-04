import java.util.*;
class course {
  String Branch;
  int Year;
  String Program;
  course(String branch, int year, String program) {
    Branch = branch;
    Year = year;
    Program = program;
  }
  final void show() {
    System.out.print("\nProgram = " + Program + "\nBranch = " + Branch + "\nYear of Study = "+Year);
    }
  }
  class student extends course {
    int RollNo;
    String name;
    student(String b, int y, String p, int r, String n) {
      super(b, y, p);
      RollNo = r;
      name = n;
    }
    void Display() {
      System.out.print("\nStudent Information:\nRoll No = " + RollNo + "\nName = " + name);
      super.show();
    }
  }
  class Single {
    public static void main(String args[]) {
      String strb, strp, strn;
      int inty, intr;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your roll number,name,program,branch and year of study: ");
      intr = scan.nextInt();
      strn = scan.next();
      strp = scan.next();
      strb = scan.next();
      inty = scan.nextInt();
      student stu = new student(strb, inty, strp, intr, strn);
      stu.Display();
    }
  }