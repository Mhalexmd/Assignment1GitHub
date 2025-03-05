import javax.swing.*;
public class AssignmentTextualize {
    public static void main(String[] args) {
        while(true){
        Textualize T1 = new Textualize();
        String StrNumber = JOptionPane.showInputDialog("Enter a number[from 1 to 999]:");
        int length = StrNumber.length();
        int IntNumber = Integer.parseInt(StrNumber);
        switch (length){
            case 1:
                JOptionPane.showMessageDialog(null, T1.digit1(IntNumber));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, T1.digit2(StrNumber));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, T1.digit3(StrNumber));
                break;
            }
        String ans = JOptionPane.showInputDialog("Do you want to EXIT?[y/n]: ");
        ans = ans.toLowerCase();
        if(ans.startsWith("y"))
            break;
        else 
            continue;
        }
    }
}