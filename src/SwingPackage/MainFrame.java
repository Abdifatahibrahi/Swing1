/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingPackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MainFrame extends JFrame{
    
    private JButton btn;
    private TextPanel tpanel;
    
    
    public MainFrame(){
        super("Hello world");
        
        setLayout(new BorderLayout());
        btn = new JButton("click me");
        tpanel = new TextPanel();
        
        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                TextPanel.appendText("hello\n");
                
            }
        });
        
        setLayout(new FlowLayout());        
        setVisible(true);        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


 class MainFrame1{
    
    
    public static void main(String[] args) {
        
        MainFrame obj = new MainFrame();
        
    }
}
