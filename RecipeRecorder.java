import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class RecipeRecorder implements ActionListener
{
    private ArrayList<Recipe> recipeBook = new ArrayList<Recipe>();
    
    JFrame f;
    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem newR, openR, copyR, delR;
    JTextArea ta;
    
    RecipeRecorder()
    {
        f = new JFrame();
        newR = new JMenuItem("New Recipe");
        openR = new JMenuItem("Open Recipt");
        copyR = new JMenuItem("Copy Recipe");
        delR = new JMenuItem("Delete Recipe");
        
        newR.addActionListener(this);
        openR.addActionListener(this);
        copyR.addActionListener(this);
        delR.addActionListener(this);
        
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        file.add(newR);
        file.add(openR);
        
        edit.add(copyR);
        edit.add(delR);
        
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        
        ta = new JTextArea();
        ta.setBounds(5, 5, 360, 360);
        
        f.add(mb);
        f.add(ta);
        
        f.setTitle("Virtual Recipe Book");
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource() == newR)
        {
            //ta.paste();
            //new InputDialog();
            runDialog();
        }
        
        if(evt.getSource() == copyR)
        {
            ta.paste();
        }
    }
    
    public static void main(String[] args)
    {
        new RecipeRecorder();
    }
    
    public static void runDialog()
    {
        javax.swing.SwingUtilities.invokeLater(
        new Runnable()
            {
                public void run () { new solve1(); }
            }
        );
    }
    
    
}
