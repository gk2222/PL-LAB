import java.util.Scanner;
public interface Medicine {
  public void get();
  public void showMed();
  public void check(int y);
}
class medicines implements Medicine {
  int BatchNo;
  String name;
  float cost;
  int shelfNo;
  int YOE;
  String remark;
  public void get() {
    Scanner sc1 = new Scanner(System.in);
    System.out.print("\nEnter batch no:");
    BatchNo = sc1.nextInt();
    System.out.print("Enter commercial name:");
    name = sc1.next();
    System.out.print("Enter cost:");
    cost = sc1.nextFloat();
    System.out.print("Enter shelf no:");
    shelfNo = sc1.nextInt();
    System.out.print("Enter year of expiry:");
    YOE = sc1.nextInt();
  }
  public void check(int y) {
    if (y >= 2022)
      this.remark = "Useful Drug!";
    else
      this.remark = "Expired Drug!";
  }
  public void showMed() {
    this.check(this.YOE);
    System.out.print("\nMedicine:\nBatch No = "+BatchNo+"\nName = "+name+"\nCost = "+cost+"\nShelf No = "+shelfNo+"\nYear of Expiry = "+YOE+"\nRemark = "+remark+"\n");
    }
  }
  class MED1 {
    public static void main(String args[]) {
      medicines med1 = new medicines();
      med1.get();
      med1.showMed();
      medicines med2 = new medicines();
      med2.get();
      med2.showMed();
    }

  }