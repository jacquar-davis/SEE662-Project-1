import javax.swing.*;
import java.awt.event.*;

public class Tester2_App implements ActionListener
{
    JFrame f;
    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, select;
    JTextArea ta;
    
    
    Tester2_App()
    {
    	f = new JFrame();
    	cut = new JMenuItem("Cut");
    	copy = new JMenuItem("Copy");
    	paste = new JMenuItem("Paste");
    	select = new JMenuItem("Select All");
    	
    	cut.addActionListener(this);
    	copy.addActionListener(this);
    	paste.addActionListener(this);
    	select.addActionListener(this);
    	
    	mb = new JMenuBar();
    	file = new JMenu("File");
    	edit = new JMenu("Edit");
    	help = new JMenu("Help");
    	
    	edit.add(cut);
    	edit.add(copy);
    	edit.add(paste);
    	edit.add(select);
    	
    	mb.add(file);
    	mb.add(edit);
    	mb.add(help);
    	
    	ta = new JTextArea();
    	ta.setBounds(5, 5, 360, 320);
    	f.add(mb);
    	f.add(ta);
    	
    	f.setJMenuBar(mb);
    	f.setLayout(null);
    	f.setSize(400, 400);
    	f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt)
    {
    	if(evt.getSource() == cut)
    	{
    		//ta.cut();
    		new JAVASwingFormExample();
    	}
    	if(evt.getSource() == copy)
    	{
    		ta.copy();
    	}
    	if(evt.getSource() == paste)
    	{
    		ta.paste();
    	}
    	if(evt.getSource() == select)
    	{
    		//ta.selectAll();
    		new InputDialog();
    	}
    }
    
    public static void main(String[] args)
    {
    	new Tester2_App();
    }
}