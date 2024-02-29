package java2;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        String name = String.valueOf(JOptionPane.showInputDialog(frame,"Enter Name:"));
        String code = String.valueOf(JOptionPane.showInputDialog(frame,"Enter Code:"));
        
        JOptionPane.showMessageDialog(frame, "Name       Code\n"+name+"      "+code);
    }
}
     