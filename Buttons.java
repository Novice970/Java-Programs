import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class Buttons{
     JLabel label;
     JTextField textfield;
     JButton button;
     
     public Buttons(){
         label=new JLabel("");
         textfield=new JTextField("tyoe text here");
         JFrame frame=new JFrame("using textfeilds");
         button=new JButton("put text in label");
         frame.setLayout(new FlowLayout());
         frame.setSize(500,300); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         button.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                 label.setText(textfield.getText());
             }
             
         });
         
         frame.add(textfield);
         frame.add(button);
         frame.add(label);
         frame.setVisible(true);
     }
     public static void main(String[] args){
         SwingUtilities.invokeLater(new Runnable(){
             public void run(){
                 new Buttons();
             }
         });
     }
 }