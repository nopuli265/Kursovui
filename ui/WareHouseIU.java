package linh.ui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WareHouseIU extends JFrame {
	JPanel pnTitle;
	JPanel pnContent;
	JLabel jlabTitle;
	JPanel pnMain;

	JTextField txtNameCilent;
	JTextField txtIdClient;
	JTextField txtPhone;
	JTextField txtMail;

	JTextField txtIDProduct;
	JTextField txtNameProduct;
	JTextField txtNumberOfPr;
	JTextField txtMFG;
	JTextField txtEXP;

	JTabbedPane jtbMain;
	JPanel pnTabHome;
	JPanel pnTabAdmin;
	JPanel pnTabClient;





	public WareHouseIU(String title) {
		super(title);

		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub

	}

	private void addControls() {
		Container con = getContentPane();
		pnMain= new JPanel();
		pnMain.setLayout(new BorderLayout());
		
		jlabTitle = new JLabel("Добро пожаловать в программное"
				+ "обеспечение для управления логистикой");
		pnTitle= new JPanel();
		pnTitle.setLayout(new FlowLayout(FlowLayout.CENTER));
		jlabTitle.setForeground(new Color(230, 230, 250));
		jlabTitle.setFont(new Font("Sylfaen", Font.BOLD, 20));
		jlabTitle.setVerticalAlignment(SwingConstants.CENTER);

		pnTitle.setPreferredSize(new Dimension(0, 100));
		pnTitle.setBackground(new Color(25, 25, 112));

		pnTitle.add(jlabTitle);

		pnMain.add(pnTitle);
		pnContent= new JPanel();
		pnMain.add(pnContent);


		con.add(pnTitle,BorderLayout.NORTH);
	}

	public void showWindow() {
		this.setSize(300,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
