// Java Program to create a simple JComboBox  
// and add elements to it 
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
class solve extends JFrame implements ItemListener, ActionListener { 
  
    // frame 
    static JFrame f; 
  
    // label 
    static JLabel l, l1, l2, l3; 
  
    // combobox 
    static JComboBox c1; 
    
    static JTextField textField;
    static JTextField textField1;
    static JTextField textField2;
    static JButton btn1, btn2, btn3;
    //static JLabel l, l1;
  
    // main class 
    public static void main(String[] args) 
    //public solve()
    { 
        // create a new frame 
        f = new JFrame("Recipe Recorder"); 
  
        // create a object 
        solve s = new solve(); 
  
        // set layout of frame 
        //f.setLayout(new FlowLayout()); 
        f.setLayout(new GridLayout(3,3)); 
        
        l2 = new JLabel("Enter name: ");
        f.add(l2);
        textField = new JTextField(30);
        f.getContentPane().add(textField);
        
        btn1 = new JButton("Enter Name");
        f.getContentPane().add(btn1);
        //btn1.addActionListener(this);
        //btn1.addActionListener(this);
        
        l3 = new JLabel("\nEnter Description");
        f.add(l3);
        textField1 = new JTextField(30);
        f.getContentPane().add(textField1);
        
        btn2 = new JButton("Enter Description");
        f.getContentPane().add(btn2);
        //btn2.addActionListener(this);
  
        // array of string contating cities 
        String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" }; 
  
        // create checkbox 
        c1 = new JComboBox(s1); 
  
        // add ItemListener 
        c1.addItemListener(s); 
  
        // create labels 
        l = new JLabel("select your city "); 
        l1 = new JLabel("Jalpaiguri selected"); 
  
        // set color of text 
        l.setForeground(Color.red); 
        l1.setForeground(Color.blue); 
  
        // create a new panel 
        JPanel p = new JPanel(); 
  
        p.add(l); 
  
        // add combobox to panel 
        p.add(c1); 
  
        p.add(l1); 
        
        btn3 = new JButton("Enter");
        p.add(btn3);
        btn3.addActionListener(s);
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(400, 300); 
  
        f.show(); 
    } 
   
    
    
    public void itemStateChanged(ItemEvent e) 
    { 
        // if the state combobox is changed 
        if (e.getSource() == c1) { 
  
            l1.setText(c1.getSelectedItem() + " selected"); 
        } 
    } 
    
    //@Override
    public void actionPerformed(ActionEvent evt)
    {
        
    }
}