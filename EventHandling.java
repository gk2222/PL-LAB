import java.awt.*;
import java.awt.event.*;
class EventHandling extends Frame implements ActionListener {
  TextField tf;
  EventHandling() {

    tf = new TextField();
    tf.setBounds(60, 50, 170, 20);
    Button b = new Button("click me");
    b.setBounds(100, 120, 80, 30);
    //register listener
    b.addActionListener(this); 

    add(b);
    add(tf);
    setSize(300, 300);
    setLayout(null);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
    tf.setText("Welcome to  the GUI");
  }
  public static void main(String args[]) {
    new EventHandling();
  }
}