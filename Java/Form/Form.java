import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Form extends JFrame{
	public static void main(String[] args){
	Container c;
	BoxLayout layoutpanels;
	GridLayout layout1;
	

		layout1 = new GridLayout(6,2,0,5);
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel l1 = new JLabel("Name");
		JLabel l2 = new JLabel("Father Name");

		Font font = new Font("Consolas",Font.BOLD,25);
		Font font2 = new Font("Arial",Font.ITALIC,12);

		JTextField f1 = new JTextField();
		f1.setBounds(10,50,50,40);
		f1.setFont(font);

		JTextField f2 = new JTextField();
		f2.setBounds(10,50,50,40);
		f2.setFont(font);

		JLabel l3 = new JLabel("Address");
		JTextArea f3 = new JTextArea();
		f3.setBounds(10,50,50,40);
		f3.setFont(font2);

		JLabel l4 = new JLabel("Gmail id");
		JTextField f4 = new JTextField();
		f4.setBounds(10,50,50,40);
		f4.setFont(font);

		JLabel l5 = new JLabel("Passward");
		JPasswordField pass = new JPasswordField();
		pass.setBounds(10,50,50,40);
		//JCheckBox cb1 = new JCheckBox("Male");
		//cb1.setBounds(100,50,100,40);

		JRadioButton rb1 = new JRadioButton("Male");
		rb1.setBounds(100,50,100,40);
		//JCheckBox cb2 = new JCheckBox("Female");
		//cb2.setBounds(100,50,100,40);
		JRadioButton rb2 = new JRadioButton("Female");
		rb2.setBounds(100,50,100,40);

		ButtonGroup gen = new ButtonGroup();
		gen.add(rb1);
		gen.add(rb2);
		
		JFrame f = new JFrame("Form");
		JButton b1 = new JButton("     OK     ");
		b1.setSize(20,20);
		JButton b2 = new JButton("CANCEL");
		b2.setSize(20,20);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);

		c = f.getContentPane();

		JPanel p1 = new JPanel();
		p1.setLayout(layout1);
		p1.setBackground(Color.WHITE);
		p1.setBounds(100,100,450,450);
		p1.add(l1);
		p1.add(f1);
		p1.add(l2);
		p1.add(f2);
		p1.add(l3);
		p1.add(f3);
		p1.add(l4);
		p1.add(f4);
		p1.add(l5);
		p1.add(pass);
		p1.add(rb1);
		p1.add(rb2);

		JPanel p2 = new JPanel();
		p2.setBackground(Color.PINK);
		p2.setBounds(100,200,50,50);
		p2.setLayout(grid);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		//gbc.ipady = 20;
		gbc.gridx = 0;
		gbc.gridy = 0;
		p2.add(b1,gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		//gbc.ipady = 20;
		gbc.gridx = 1;
		gbc.gridy = 0;
		p2.add(b2,gbc);
		
		layoutpanels = new BoxLayout(c, BoxLayout.PAGE_AXIS);
		
		c.setBackground(Color.YELLOW);
		c.setLayout(layoutpanels);
		c.add(p1);
		c.add(p2);
		
	}
}