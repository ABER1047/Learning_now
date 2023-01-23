import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class test_interface 
{
    public static void main(String[] args)
    {
    //create window
    JFrame frame = new JFrame();
    
    //window size
    frame.setSize(1280,720);
    
    //set window title
    frame.setTitle("name");
    
    //show GUI (window)
    frame.setVisible(true);
    
    //make cannot close with X button pressed
    //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    
    //prevent frame from being resized
    frame.setResizable(false);
    
    //add logo for window
    ImageIcon image = new ImageIcon("C:/Users/1047a/OneDrive/바탕 화면/Learning/java/image.png"); //create image icon for window icon
    frame.setIconImage(image.getImage());
    
    //change background color
    frame.getContentPane().setBackground(Color.gray);
    //or you can get your custom color with "new Color(R,G,B);" or "new Color(Hex)"
    }
}
