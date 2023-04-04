import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI implements ActionListener {
	JFrame frame;
	JTextField operand1, operand2;
	JCheckBox plus, minus;
	ButtonGroup bg;
	JLabel plusText, minusText;
	JButton equals;
	JLabel result;
	
	public GUI(){
		frame = new JFrame("Calculator");
		operand1 = new JTextField();
	    operand2 = new JTextField();
	    
	    operand1.setBounds(10, 20, 200, 20);
	    operand2.setBounds(300, 20, 200, 20);
	    
        plus = new JCheckBox();  
        plus.setBounds(215, 10, 20, 20);  
        minus = new JCheckBox();  
        minus.setBounds(215, 30, 20, 20);    
		
        bg = new ButtonGroup();
        bg.add(plus);bg.add(minus);
        
        plusText=new JLabel("Plus"); 
        plusText.setBounds(240, -5, 50, 50);
        minusText=new JLabel("Minus"); 
        minusText.setBounds(240, 15, 50, 50);
        
        equals = new JButton("=");
        equals.setBounds(510, 17, 45, 25);
        equals.addActionListener(this);
        
        result = new JLabel("Here is the result!"); 
        result.setBounds(570, 19, 200, 20);
        
		frame.add(operand1);
		frame.add(operand2);
		frame.add(plus);
		frame.add(plusText);
		frame.add(minus);
		frame.add(minusText);
		frame.add(equals);
		frame.add(result);
		
	    frame.setSize(700,100);  
	    frame.setLayout(null);  
	    frame.setVisible(true);  	    
	}
	
	public void calculate() {
		try {
			double o1 = Double.parseDouble(operand1.getText());
			double o2 = Double.parseDouble(operand2.getText());
			if(plus.isSelected()) {
				result.setText(Double.toString(o1 + o2));
			}
			else if(minus.isSelected()) {
				result.setText(Double.toString(o1 - o2));
			}
			else {
				JOptionPane.showMessageDialog(null, "Select an operation!");  
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);  
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		calculate();	
	}

	
	public static void main(String[] args) {
		new GUI();

	}
	
}
