import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Accesories extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton quit = new JButton("QUIT");
  
  public Accesories(){
    setLayout(new GridBagLayout());
    
    quit.addActionListener(this);
    
    setLayout(new GridBagLayout());
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,50,20);
    
    gbc.weightx=1;
    gbc.weighty=1;
    gbc.ipady=0;
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(quit,gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(quit)){
        System.exit(0);
      }
    }
  }
}