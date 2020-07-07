
package frame;

import javax.swing.*;
import java.awt.*;// abstract window toolkit

public class Main extends JFrame {

    public Main (){
//    { JFrame frame = new JFrame("Frame title");
//   // frame.setTitle("Frame title");
//   // frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//   frame.setSize(new Dimension(100,100));
//   //frame.setSize(100,100);
//   
////   frame.setLocation(100,50);
////   frame.setLocation(new Point (100,50));
//   frame.setBounds(100,50,100,100);
//   frame.setResizable(false);
//   frame.setIconImage(Toolkit.getDefaultToolkit().getImage("trophy.png"));
//   frame.setDefaultCloseOperation(3); 
//   frame.setVisible(true);
super("Frame title");
            this.setBounds(100,50,100,100);
            this.setDefaultCloseOperation (3);
//            this.pack();
            
    }
    
    public static void main (String [] args) {
        
    
    
    new Main().setVisible(true);
}
        
    
}
