import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class InternationalFlight extends JFrame
{
	JComboBox CBFrom, CBTo, CBClass, CBAdult, CBChildren, CBInfant;
	JLabel LFrom, LTo, LBookingDate, LClass, LAdult, LChildren, LInfant, LBookingDetails, LPassengerDetails, LDate, LImg1, LImg2, LNotes;
	JTextField TFBookingDate;
	Icon img1, img2;
	JButton BFindFlight;
	JPanel PPanel1, PPanel2;

	LoginPage type1;

	public InternationalFlight(LoginPage type1)
	{
		Container c =getContentPane();
		c.setLayout(new BorderLayout());
		String[] sItem1={"Trivandrum"};
		String[] sItem2={"Bali","Bangkok","Cairo","CapeTown","Chicago","Dubai","Frankfurt","HongKong","Istanbul","London","LosAngeles","Melbourne","New York","Paris","Rome","SanFrancisco","shanghai","Singapore","Sydney","Toronto"};
		String[] sItem3={"Economic","Business"};

		this.type1 = type1;
		PPanel1 = new JPanel(null);
		PPanel1.setPreferredSize(new Dimension(500,200));

		LBookingDetails = new JLabel("<html><b><font color=\"#C71585\">Booking Details</font></b></html>");
		LFrom = new JLabel("From          :");
		LTo = new JLabel("To               :");
		LBookingDate = new JLabel("Booking Date:");
		LClass = new JLabel("Class         :");

		CBFrom = new JComboBox(sItem1);
		CBTo = new JComboBox(sItem2);
		CBClass = new JComboBox(sItem3);

		TFBookingDate = new JTextField(10);
		LDate = new JLabel("(DD/MM/YYYY)");
		LDate.setForeground(Color.red);

		img1=new ImageIcon("map1.jpg");
		LImg1 = new JLabel(img1);

		BFindFlight = new JButton("Find Flight");

		LBookingDetails.setBounds(20,3,100,20);

		LFrom.setBounds(20,40,100,20);
		CBFrom.setBounds(100,40,100,20);

		LTo.setBounds(20,100,100,20);
		CBTo.setBounds(100,100,100,20);

		LBookingDate.setBounds(14,160,100,20);
		TFBookingDate.setBounds(100,160,100,20);
		LDate.setBounds(210,160,100,20);

		LClass.setBounds(20,220,100,20);
		CBClass.setBounds(100,220,100,20);

		BFindFlight.setBounds(50,270,100,25);

		LImg1.setBounds(0,290,495,260);

		PPanel1.add(LBookingDetails);
		PPanel1.add(LFrom);
		PPanel1.add(CBFrom);
		PPanel1.add(LTo);
		PPanel1.add(CBTo);
		PPanel1.add(LBookingDate);
		PPanel1.add(TFBookingDate);
		PPanel1.add(LDate);
		PPanel1.add(LClass);
		PPanel1.add(CBClass);
		PPanel1.add(BFindFlight);
		PPanel1.add(LImg1);
		PPanel1.setBackground(Color.white);

		c.add(PPanel1,BorderLayout.WEST);

		PPanel2 = new JPanel(null);
		PPanel2.setPreferredSize(new Dimension(320,160));

		LPassengerDetails=new JLabel("<html><b><font color=\"#C71585\">PassengerDetails</font></b></html>");

		LAdult = new JLabel("Adults(12+)");

		LChildren = new JLabel("Children(2-11)");
		LInfant = new JLabel("Infants(under 2)");

		String[] item4={"1","2","3","4","5","6"};
		CBAdult = new JComboBox(item4);

		String[] item5={"0","1","2","3","4"};
		CBChildren = new JComboBox(item5);

		String[] item6={"0","1","2","3"};
		CBInfant = new JComboBox(item6);

		img2 = new ImageIcon("note_bg.gif");
		LImg2 = new JLabel(img2);
		LNotes = new JLabel("<html><body><p>NOTE: Bookings with International Credit Cards <p> have temporarily been suspended.This Service<p> will resume shortly and we will have a notice<p> posted on our website.We regret any <p>inconvenience caused to our passengers.</body></html>");

		LPassengerDetails.setBounds(40,3,100,20);

		LAdult.setBounds(40,40,100,20);
		CBAdult.setBounds(140,40,100,20);

		LChildren.setBounds(40,105,100,20);
		CBChildren.setBounds(140,105,100,20);

		LInfant.setBounds(40,170,100,20);
		CBInfant.setBounds(140,170,100,20);

		LImg2.setBounds(16,220,320,200);
		LNotes.setBounds(55,240,380,180);

		PPanel2.add(LPassengerDetails);
		PPanel2.add(LAdult);
		PPanel2.add(LChildren);
		PPanel2.add(LInfant);
		PPanel2.add(CBAdult);
		PPanel2.add(CBChildren);
		PPanel2.add(CBInfant);

		PPanel2.add(LNotes);
		PPanel2.add(LImg2);

		PPanel2.setBackground(Color.white);

		c.add(PPanel2,BorderLayout.EAST);

		setSize(795,580);
		setVisible(true);

		BFindFlight.addActionListener(new button2(this, type1));
	}
	public static void main(String args[])
	{
		LoginPage type1=null;
		new InternationalFlight(type1);
	}
}
