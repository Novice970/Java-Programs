import javax.swing.*;

public class gui {
	public static void main(String[] args){
		String firstname = JOptionPane.showInputDialog("Enetr your firstname");
		String lastname=JOptionPane.showInputDialog("Enter your lastname");
		JOptionPane.showMessageDialog(null,"Your name is "+ firstname+ " "+lastname,"title",JOptionPane.PLAIN_MESSAGE);
		
		
		
		
	}

}
