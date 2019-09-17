import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * Write a description of class as here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InputDialog extends JFrame
{
    JTextField tfDisplay;
    JFrame frame;
    
    
    public InputDialog() {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(3, 2, 3, 3));
        //frame.setLayout(new GridLayout(3, 2, 3, 3));
        
        tfDisplay = new JTextField(10);
        tfDisplay.setEditable(false);
        cp.add(tfDisplay);
        //frame.add(tfDisplay);
        
        JButton btn = new JButton("Input");
        cp.add(btn);
        //frame.add(btn);
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
                tfDisplay.setText(numberIn + "");
            }
        });
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setDefaultCloseOperation(frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)));
        //frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)));
        setSize(300, 100);
        setTitle("Test Input Dialog");
        setVisible(true);
        
    }
   
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() {
                new InputDialog();
            }
        } );
    }
}
