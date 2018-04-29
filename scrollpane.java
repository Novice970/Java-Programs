import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class scrollpane{
        JLabel label;
        JList list;
        JScrollPane spane;
        String[] names;
    public scrollpane(){
        label=new JLabel("");
        names=new String[]{"Puneet","Jacob","Bhaskar","Sarojini","Kumkum Bhagya"};
        list=new JList(names);
         list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      list.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent le) {
            int index = list.getSelectedIndex();
            if (index != -1) {
               label.setText("Site to visit: " + names[index]);
            }
         }
      });
      spane=new JScrollPane(list);
      spane.setPreferredSize(new Dimension(120,90));
       
        JFrame frame=new JFrame("List:");
        frame.setLayout(new FlowLayout());
        
        frame.setSize(100,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame.add(list);
        frame.add(spane);
        frame.add(label);
        frame.setVisible(true);
        
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new scrollpane();
            }
        });
    }
}
