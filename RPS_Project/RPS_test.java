package RPS_Project;
import java.util.Random;

import javax.swing.JOptionPane;

public class RPS_test {
public static void main(String[] args) {
	for (int i = 0; i < 100; i++) {
		
	
	String choice = JOptionPane.showInputDialog("Rock, Paper Scissors");
	int r = new Random().nextInt(3);
	
	if(choice.equals("rock"))
	{
		if(r == 1)
		{
		}
		else if(r == 2)
		{
			JOptionPane.showMessageDialog(null, "You loose");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You win");
		}
	}
	else if(choice.equals("paper"))
	{
		if(r == 1)
		{
			JOptionPane.showMessageDialog(null, "You win");
		}
		else if(r == 2)
		{
			JOptionPane.showMessageDialog(null, "It's a tie");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You loose");
		}
	}
	else
	{
		if(r == 1)
		{
			JOptionPane.showMessageDialog(null, "You loose");
		}
		else if(r == 2)
		{
			JOptionPane.showMessageDialog(null, "You win");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "It's a tie");
		}
	}
	}
}
}

