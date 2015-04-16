package calculator;

import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;


public class Calculator {
        
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JFrame calc = new JFrame("First frame");
        calc.setSize(400, 400);
        calc.setLayout(new FlowLayout());
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setIconImage(new ImageIcon("d:/Icons/apple.png").getImage());
        calc.setLayout(new FlowLayout());
        calc.setVisible(true);
        
        JTextField text = new JTextField("Hello", 20);
        calc.add(text);
    }

    
}
