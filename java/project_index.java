import java.awt.*;
import javax.swing.*;



public class project_index extends JFrame
{
    project_index()
    {
    //window size
    this.setSize(1280,720);
    
    //set window title
    this.setTitle("name");
    
    //make cannot close with X button pressed
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //prevent frame from being resized
    this.setResizable(false);
    
    this.setLocationRelativeTo(null);
    
    //show GUI (window)
    this.setVisible(true);
    

    //add logo for window
    ImageIcon image = new ImageIcon("image.png"); //create image icon for window icon
    this.setIconImage(image.getImage());
    
    //change background color
    this.getContentPane().setBackground(Color.gray);
    //or you can get your custom color with "new Color(R,G,B);" or "new Color(Hex)"
    }
    
    public void draw(Graphics g)
    {
    Graphics2D g2D = (Graphics2D) g;
    
    g2D.drawLine(0, 0, 1280, 1280);
    }
}
