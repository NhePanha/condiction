package java2.java3;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class JOpan {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        Scanner sc = new Scanner(System.in);
        String code = String.valueOf(JOptionPane.showInputDialog(frame,"Enter Code : "));
        String name = String.valueOf(JOptionPane.showInputDialog(frame,"Enter Name : "));
        String gender = String.valueOf(JOptionPane.showInputDialog(frame,"Enter Gender : "));
        String salary = String.valueOf(JOptionPane.showInputDialog(frame,"Enter Salary : "));
        JOptionPane.showMessageDialog(null,"Code     Name     Gender     Salary\n"+code+"     "+name+"     "+gender+"     "+salary);
    }
}

    