import java.io.*;
import java.net.*;
public class Server {
  public static void main(String args[]) {
    try {
      ServerSocket ss = new ServerSocket(3000);
      System.out.println("Waiting for connection !!");
      Socket s = ss.accept();
      System.out.println("Connection established....");
      DataInputStream dis = new DataInputStream(s.getInputStream());
      String str = (String) dis.readUTF();
      System.out.println("Message from client : ");
      System.out.println("Message = " + str);
      DataOutputStream out = new DataOutputStream(s.getOutputStream());
      out.writeUTF(str.toLowerCase());
      ss.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}