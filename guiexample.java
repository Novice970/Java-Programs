import javax.swing.*;

public class guiexample{
    guiexample(){
        JFrame frame=new JFrame("gui example");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("Hello,World");
        frame.add(label);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    new guiexample();
                }
        });
    
        
    }
}