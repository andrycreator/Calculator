package calculator;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends Frame implements ActionListener {
    
    public Calculator() {
    }
    
    public Calculator(String title) {
        super(title);
    }

    
    public static void main(String[] args) {
        Frame calc = new Calculator("First frame");
        calc.setSize(400, 400);
        calc.setLayout(new FlowLayout());
        calc.setVisible(true);
        
        
        Button button = new Button("Test");
        button.setSize(20, 60);
        calc.add(button);
        
        Label label = new Label();
        calc.add(label);
        
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
