import javax.swing.JOptionPane;

public class gui_intro {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        //showInputDialog give string as answer so it is imp to convert it to required  type
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age: "));
        JOptionPane.showMessageDialog(null,"You are "+age+ " years old.");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your height: "));
        JOptionPane.showMessageDialog(null,"You are "+height+ " cms tall.");

    }
}
