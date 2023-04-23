package Com.Example;
import javax.swing.JOptionPane;
public class UserInterFace {
    public static void main(String[]args){
        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        String surname = JOptionPane.showInputDialog("Enter your surname");
        JOptionPane.showMessageDialog(null, "Hello Mr "+surname);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "your are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in foots"));
        JOptionPane.showMessageDialog(null, "you are "+height +"Foot tall");


    }
}
