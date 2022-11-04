import java.io.*;
import java.net.*;
public class Client {
  public static void main(String args[]) {
    try {
      Socket s = new Socket("localhost", 3000);
      DataOutputStream out = new DataOutputStream(s.getOutputStream());
      out.writeUTF("GOOD AFTERNOON");
      DataInputStream dis = new DataInputStream(s.getInputStream());
      String str = (String) dis.readUTF();
      System.out.println("Message from Server :");
      System.out.println("Message = " + str);
      out.flush();
      out.close();
      s.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}