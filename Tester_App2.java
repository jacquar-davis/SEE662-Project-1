import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tester_App2 extends JFrame
{
	JMenuBar menuBar;
	JMenu menMenu;
	JMenuItem i1, i2, i3;
	
	public menuDisplay() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(3, 2));
		
		menuBar = new JMenuBar();
		menMenu = new JMenu("Menu");
		
		cp.add(menuBar);
		
		JButton btn = new JButton("Tester");
		cp.add(btn);
		
		btn.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean validInput = false;
                int numberIn;
                String inputStr = JOptionPane.showInputDialog("Enter a number [1-9]: ");
                do {
                    try{
                        numberIn = Integer.parseInt(inputStr);
                    } catch (NumberFormatException ex) {
                        numberIn = -1;
                    }
                    if (numberIn < 1 || numberIn > 15) {
                        inputStr = JOptionPane.showInputDialog("Invalid number!");
                    } else { JOptionPane.showMessageDialog(null, "You have entered " + numberIn);
                             validInput = true;}
                } while (!validInput);
                //tfDisplay.setText(numberIn + "");
            }
        });
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setTitle("Testy McTest");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable()
				{
					public void run() {
						new MenuDisplay();
					}
				});
	}
}