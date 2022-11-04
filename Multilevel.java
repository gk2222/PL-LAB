import java.util.*;
class library {
  protected String booktype;
  protected int nob;
  public library() {
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter type and number of books:");
    booktype = sc1.next();
    nob = sc1.nextInt();
  }
  void show() {
    System.out.print(booktype+"\t"+nob);
  }
}
class book extends library {
  protected String Bname;
  protected float cost;
  public book() {
    super();
    Scanner sc2 = new Scanner(System.in);
    System.out.print("Enter name and cost of one book:");
    Bname = sc2.next();
    cost = sc2.nextFloat();
  }
  void show() {
    System.out.print("\t"+Bname+"\t"+cost+"\t");
    super.show();
  }
}
class reader extends book {
  int userID;
  String username;
  reader() {
    super();
    Scanner sc3 = new Scanner(System.in);
    System.out.print("Enter userid and username:");
    userID = sc3.nextInt();
    username = sc3.next();
  }
  void show() {
    System.out.print("\n"+userID+"\t"+username+"\t");
    super.show();
  }
}
class Multilevel {
  public static void main(String args[]) {
    int i, n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of records:");
    n = sc.nextInt();
    reader r[] = new reader[n];
    for (i = 0; i < n; i++) {
      r[i] = new reader();
    }
    System.out.print("\nBook Issues Record:\nUser ID\tusername\tBook name\tcost\ttype\tcopies");
      for (i = 0; i < n; i++) {
        r[i].show();
      }
    }

  }