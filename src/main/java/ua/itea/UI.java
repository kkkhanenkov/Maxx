package ua.itea;

import java.awt.BorderLayout;
import java.net.URL;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UI extends JFrame {
	Heroe heroe;
	JTable jt;
	String [] headers = {"Id","Name","Ultimate"};
//	URL url = this.getClass().getClassLoader().getResource("androidparty.jpg");
//	JLabel label = new JLabel(new ImageIcon(url));
	
	UI(){
		setLayout(new BorderLayout());
		jt = new JTable(getTable(),headers);
		jt.setBounds(50,50,200,230);
		JScrollPane sp = new JScrollPane(jt);
		add(sp, BorderLayout.NORTH);
		
		setSize(300,400);
//		add(label, BorderLayout.SOUTH);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	String [][] getTable(){
		List heroes = new ConnectionDB().getAllHeroes();
		String [][] table = new String[heroes.size()][3];
		for(int i = 1;i < heroes.size();i++) {
			String id = String.valueOf(heroe.getID());
			String name = heroe.getNAME();
			String ultimate = heroe.getULTIMATE();
			String [] oneHeroe = {id, name, ultimate};
			table[i] = oneHeroe;	
		}
		return table;
	}
}
