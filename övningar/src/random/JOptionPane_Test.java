package random;

import java.awt.Component;

import javax.swing.JOptionPane;

public class JOptionPane_Test {
  public static void main(String[] argv) throws Exception {
    int i = okcancel("Are your sure ?");
    System.out.println("ret : " + i);

  }

  public static int okcancel(String theMessage) {
    int result = JOptionPane.showConfirmDialog(null, theMessage,
        "alert", JOptionPane.OK_CANCEL_OPTION);
    return result;
  }

}