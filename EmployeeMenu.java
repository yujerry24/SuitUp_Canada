import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmployeeMenu extends JPanel implements ActionListener {
  
  GridBagConstraints gbc = new GridBagConstraints();
  
  JLabel employeeMenu = new JLabel("Employee Menu");
  JButton hrButton = new JButton("HUMAN RESOURCES");
  JButton accountingButton = new JButton("ACCOUNTING");
  JButton quit = new JButton("QUIT");
  
  public EmployeeMenu(){
    setLayout(new GridBagLayout());
    
    hrButton.addActionListener(this);
    accountingButton.addActionListener(this);
    quit.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;

    gbc.gridx = 3;
    gbc.gridy = 1;
    add(hrButton,gbc);
    gbc.gridx = 3;
    gbc.gridy = 2;
    add(accountingButton,gbc);
    gbc.gridx = 3;
    gbc.gridy = 0;
    employeeMenu.setFont(new Font("Serif", Font.BOLD, 20));
    add(employeeMenu, gbc);
    gbc.gridx = 3;
    gbc.gridy = 5;
    add(quit, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(hrButton)){
        SuitUpCanada.setContent(new HumanResources());
      }
      else if(buttonPressed.equals(accoutingButton)){
        SuitUpCanada.setContent(new Accouting());
      }
      else if(buttonPressed.equals(quit)){
        System.exit(0);
      }
    }
  }
}