package linh.ui;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.event.*;
public class Warehouse extends JFrame{
	Container con=getContentPane();
	JButton logout;
	JButton login;
	JPanel pnMain= new JPanel();
	JLabel jlbFactory;
	public Warehouse(String title){
		super (title);
		addControls();
		addEvents();
	}

	public void addEvents() {
		// TODO Auto-generated method stub

	}

	public void addControls() {
		// TODO Auto-generated method stub
		title();
	}

	//thanh tieu de va thanh menu

	public void title() {
		JPanel pnTitle= new JPanel();
		JPanel pnDn= new JPanel();
		JPanel pnMenu= new JPanel();
		pnMenu.setLayout( new FlowLayout(FlowLayout.CENTER));
		pnDn.setLayout(new FlowLayout(FlowLayout.TRAILING));
		pnTitle.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnTitle.setForeground(new Color(0, 0, 0));
		pnTitle.setBackground(new Color(25, 25, 112));
		JLabel jlbTitle= new JLabel("ÄÎÁÐÎ ÏÎÆÀËÎÂÀÒÜ ÍÀ ÍÀØ ÑÊËÀÄ ÓÏÐÀÂËÅÍÈß ËÎÃÈÑÒÈÊÎÉ");
		Font font = new Font("Arial",Font.BOLD,15);
		jlbTitle.setFont(font);
		jlbTitle.setForeground(Color.BLUE);

		JMenuBar menuBar= new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnHeThong = new JMenu("Quan li he thong");
		JMenu mnSanPham= new JMenu("Quan li san pham");
		JMenu mnNhanvien= new JMenu("Nhan Vien");
		JMenu mnClient = new JMenu("Thong tin doi tac");
		JMenu mnNhapHang= new JMenu("Nhap Hang");
		JMenu mnXuatHang= new JMenu("Xuat Hang");
		JMenu mnBaoCao= new JMenu("Bao Cao");

		menuBar.add(mnHeThong);
		menuBar.add(mnSanPham);
		menuBar.add(mnNhanvien);
		menuBar.add(mnClient);
		menuBar.add(mnNhapHang);
		menuBar.add(mnXuatHang);
		menuBar.add(mnBaoCao);
		pnMain.setLayout(new FlowLayout());
		pnMenu.add(menuBar);
		pnMain.add(pnTitle);
		pnMain.add(pnDn);
		pnMain.add(pnMenu);
		con.add(pnMain);


	}
//	jlabThanks.setIcon(load("C:\\Users\\nopud\\Desktop\\thank.jpg",800,250));

	// edit image
	public Icon load(String linkImage, int k, int m) {
		try {
			BufferedImage image = ImageIO.read(new File(linkImage));
			int x = k;
			int y = m;
			int ix = image.getWidth();
			int iy = image.getHeight();
			int dx = 0, dy = 0;

			if (x / y > ix / iy) {
				dy = y;
				dx = dy * ix / iy;
			} else {
				dx = x;
				dy = dx * iy / ix;
			}

			return new ImageIcon(image.getScaledInstance(dx, dy,
					image.SCALE_SMOOTH));

		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

	public void showWindow() {
		this.setSize(700,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
