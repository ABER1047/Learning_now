import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



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
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //prevent frame from being resized
    frame.setResizable(false);
    
    //create text label
    JLabel label = new JLabel();
    
    //draw label
    frame.add(label);
    
    //text label setting
    label.setText("f(x) = ");
    label.setVerticalTextPosition(JLabel.TOP);
    label.setHorizontalTextPosition(JLabel.LEFT);
    //change text color
    //label.setForeground(color);
    //change text font
    label.setFont(new Font("etc/BM_hanna.ttf",Font.PLAIN,24));
    label.setBounds(250,250,250,250);

    
    //image label setting
    ImageIcon image_label = new ImageIcon("image.png");
    label.setIcon(image_label);
    

    
    //add logo for window
    ImageIcon image = new ImageIcon("image.png"); //create image icon for window icon
    frame.setIconImage(image.getImage());
    
    //change background color
    frame.getContentPane().setBackground(Color.gray);
    //or you can get your custom color with "new Color(R,G,B);" or "new Color(Hex)"
    }
}
