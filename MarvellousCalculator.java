import javax.swing.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListner
{
    public JFrame mainframe;
    public Calculator(int width , int height, String title )
    {
        mainframe= new JFrame(title);
        mainframe.setSize(width,height);
        mainframe.setVisible(true);
    }
    public void windowClosing(WindowEvent obj)
    {
        System.exit();
    }

}
class MarvellousCalculator
{
    public static void main(String arg[])
    {
      Calculator cobj = new Calculator(400,400,"Marvellous Calculator");
    }
}