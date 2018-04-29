import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class textFeild{
     JLabel label;
     JTextField textfield;
     
     public textFeild(){
         label=new JLabel("");
         textfield=new JTextField("tyoe text here");
         JFrame frame=new JFrame("using textfeilds");
         
         frame.setLayout(new FlowLayout());
         frame.setSize(500,300); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         textfield.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                 label.setText(textfield.getText());
             }
             
         });
         
         frame.add(textfield);
         frame.add(label);
         frame.setVisible(true);
     }
     public static void main(String[] args){
         SwingUtilities.invokeLater(new Runnable(){
             public void run(){
                 new textFeild();
             }
         });
     }
 }