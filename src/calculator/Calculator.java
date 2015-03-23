package calculator;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends Frame {
    static Label label = new Label("label");
    static Button button = new Button("Test");
    
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
        
        button.setSize(20, 60);
        calc.add(button);
        
        calc.add(label);
        
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(button.getLabel());
            }
        });
                
    }

    
}
