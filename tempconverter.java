import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class tempconverter{
    JLabel templabel,outlabel;
    JList list;
    JTextField textfield;
    String[] type;
    JButton button;
    int index;
    int temp;
    String scale;

static double convert(int temp,String scale){
    double temprature;
    if (scale.equals("celsius")){
        temprature=(temp-32)*(5.0/9.0);
    }
    else
        temprature=temp*(9.0/5.0)+32.0;
    return temprature;
}
    public tempconverter(){
            textfield=new JTextField(5);
            templabel=new JLabel("Temprature:");
            outlabel=new JLabel("");
            type= new String[]{"celsius","farheniet"};
            button=new JButton("Convert");
            list=new JList(type);
            JFrame frame=new JFrame("Temprature Converter:");
            frame.setSize(300,400);
            frame.setLayout(new GridLayout(3,2));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
            list.addListSelectionListener(new ListSelectionListener(){
                public void valueChanged(ListSelectionEvent le){
                    index=list.getSelectedIndex();
                }
            });
        
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    temp=Integer.parseInt(textfield.getText());
                    scale=type[index];
                    outlabel.setText(Double.toString(convert(temp,scale)));
                }
            });
                    frame.add(templabel);
                    frame.add(textfield);
                    frame.add(list);
                    frame.add(button);
                    frame.add(outlabel);
                    frame.setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new tempconverter();
            }
        });
    }

}