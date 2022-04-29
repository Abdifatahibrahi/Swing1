/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingPackage;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Abdelfatah Ibrahim
 */
class TextPanel extends JPanel {
    
    private JTextArea textarea;
    
    public TextPanel(){
        
      textarea = new JTextArea();
      
      setLayout(new BorderLayout());
      
      add(textarea, BorderLayout.CENTER);
        
    }
    
}
