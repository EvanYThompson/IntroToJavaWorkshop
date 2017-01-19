import javax.swing.JOptionPane;

public class Hello_world {
public static void main(String[] args) {
	
	String verb=JOptionPane.showInputDialog("Enter a verb");
	JOptionPane.showMessageDialog(null, "Your verb is " + verb);
	String noun= JOptionPane.showInputDialog("Enter a noun");
	JOptionPane.showMessageDialog(null, "Your noun is " + noun);
	String adjective= JOptionPane.showInputDialog("Enter a adjective");	
	JOptionPane.showMessageDialog(null, "Your adjective is " + adjective);
	String proper_noun=JOptionPane.showInputDialog("Enter a proper_noun");
	JOptionPane.showMessageDialog(null, "Your proper_noun is " + proper_noun);
	JOptionPane.showMessageDialog(null, "Yo mamas so  " + adjective + " that she put two quarters in her ears and thought she was listening to 50 cents");
	
}
}
