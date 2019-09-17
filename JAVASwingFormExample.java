import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JAVASwingFormExample implements ItemListener{
 
    private JFrame frame;
    private JTextField textField;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btn1, btn2;
    private JLabel l, l1;
    private JComboBox c1;
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JAVASwingFormExample window = new JAVASwingFormExample();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the application.
     */
    public JAVASwingFormExample() {
        initialize();
    }
 
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 730, 489);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        
        textField = new JTextField(30);
        frame.getContentPane().add(textField);
        
        btn1 = new JButton("Enter Name");
        frame.getContentPane().add(btn1);
        //btn1.addActionListener(this);
        
        textField1 = new JTextField(30);
        frame.getContentPane().add(textField1);
        
        btn2 = new JButton("Enter Description");
        frame.getContentPane().add(btn2);
        //btn2.addActionListener(this);
        
        //solve s = new solve();
        String s1[] = {"tsp", "tbsp", "cup(s)"};
        c1 = new JComboBox(s1);
        c1.addItemListener(this);
        
        //l = new JLabel("Select your city");
        l1 = new JLabel("Nothing selected");
        
        frame.getContentPane().add(l);
        
        frame.getContentPane().add(c1);
        frame.getContentPane().add(l1);
        
        
 
       }
    
    /*@Override   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == c1)
        {
            l1.setText(c1.getSelectedItem() + " selected");
        }
    }*/
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        try
        {
        
            if(e.getSource() == c1)
        {
            l1.setText(c1.getSelectedItem() + " selected");
        }
    } catch(NullPointerException ex) {
        l1.setText("Nothing selected");
    }
    }
  }