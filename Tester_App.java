import java.awt.*;
import java.awt.event.*;


public class Tester_App extends Frame //implements WindowListener
implements ActionListener, WindowListener
{
    private Button btn1, btn2, btn3, btn4, btn5, btn6;
    
    public Tester_App() {
        setLayout(new GridLayout(3, 2, 3, 3));
        
        btn1 = new Button("Button 1");
        add(btn1);
        btn2 = new Button("This is Button 2");
        add(btn2);
        btn3 = new Button("3");
        add(btn3);
        btn4 = new Button("Another Button 4");
        add(btn4);
        btn5 = new Button("Button 5");
        add(btn5);
        btn6 = new Button("One More Button 6");
        add(btn6);
        
        addWindowListener(this);
        
        setTitle("GridLayout Demo");
        setSize(280, 150);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Tester_App  ();
    }
    
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource() == btn1) {
            AWTCounter app = new AWTCounter();
            }
        }
    
    @Override
   public void windowClosing(WindowEvent evt) {
	   System.exit(0);
   }
   
   @Override public void windowOpened(WindowEvent evt) {}
   @Override public void windowClosed(WindowEvent evt) {}
   
   //@Override public void windowIconified(WindowEvent evt) 
   @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
   @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
   @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
   @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
}
