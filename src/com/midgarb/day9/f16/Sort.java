//package com.midgarb.day9.f16;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
//import java.awt.GridLayout;
//import java.awt.Image;
//import java.awt.Insets;
//import java.awt.Point;
//import java.awt.SplashScreen;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.image.ImageObserver;
//import java.io.File;
//import java.text.NumberFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.LinkedList;
//import java.util.List;
//
//import javax.imageio.ImageIO;
//import javax.swing.AbstractButton;
//import javax.swing.BorderFactory;
//import javax.swing.ButtonGroup;
//import javax.swing.Icon;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFormattedTextField;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//import javax.swing.WindowConstants;
//
//import com.midgarb.day5.hw1.domain.Bmw;
//import com.midgarb.day5.hw1.domain.Pokupatel;
//import com.midgarb.day5.hw1.domain.TovarCar;
//import com.midgarb.day8.sort.copy.Action;
//
//public class Sort {
//	Graphics g;
//	private Action a;
//	private int prodIndex = 0;
//	private int id = 0;
//	private int id1 = 0;
//	 JPanel pProducts;
//	 ButtonGroup productsGroup;
//	Information inf;
//	int count;
//	TovarCar t1;
//	Pokupatel p;
//	JMenuBar menuBar;
//	JMenu menu, submenu;
//	JMenuItem menuItem;
//	JFrame fram;
//	private Object[][] obj = new Object[15][6];
//	private String[] s = { "TID", "Date", "Product", "Count", "Costumer" };
//	private int j = 0;
//	private JTable table;
//	private JScrollPane sp;
//	JPanel jp;
//	JPanel f2;
//	JPanel f1;
//	JPanel f;
//	JPanel group;
//
//	public Sort()  {
//
//		 fram = new JFrame("Sort of car");
//		fram.setLocation(200, 40);
//		fram.setMinimumSize(new Dimension(700, 300));
//		fram.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//		fram.getContentPane().add(createSellaPannel());
//		fram.pack();
//		fram.setVisible(true);
//
//	}
////	static Image image;
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		SplashScreen sp= SplashScreen.getSplashScreen();
//			Thread.sleep(1500);
//			Graphics2D  g = sp.createGraphics();
//			int i = 0;
//			while(i<200){
//				g.setColor(Color.CYAN);
//				g.fillRect(15, 200, i +=5, 30);
//				Thread.sleep(100);
//				sp.update();
//			}
//
//
//			sp.close();
//		Sort s = new Sort();
//	}
//
//	private JPanel createSellaPannel() {
//
//		f2 = new JPanel();
//		f2.setVisible(true);
//		f2.setLayout(new BorderLayout());
//		a = new Action();
//		 f = new JPanel();
//		f.setLayout(new GridBagLayout());
//		JLabel label1 = new JLabel("Name of buyer", JLabel.LEFT);
//		final JTextField tfName = new JTextField(10);
//		f.add(label1, new GridBagConstraints(0, 0, 1, 1, 0, 0,
//				GridBagConstraints.LINE_START, GridBagConstraints.NONE,
//				new Insets(-40, 0, 0, 0), 0, 0));
//		f.add(tfName, new GridBagConstraints(1, 0, 1, 1, 0, 0,
//				GridBagConstraints.LINE_START, 0, new Insets(-40, 10, 0, 0),
//				100, 0));
//		// System.out.println();
//		JLabel label2 = new JLabel("Choose the goods");
//
//
//		// String[] s ={"Bmw","Audi","Mosk"};
//		JComboBox petList = new JComboBox(printCar(a.getCar()));
//		// petList.setSelectedIndex(0);
//
//		final JPanel pProd = new JPanel();
//		// ActionListener chListener = new CBox();
//		// for (int i = 0; i<a.getCar().length;i++) {
//		// petList.setActionCommand(String.valueOf(i));
//		// petList.addActionListener(chListener);
//		// if(i==0){
//		// petList.setSelectedItem(true);
//		// }
//		// productsGroup.add(petList);
//		pProd.add(petList);
//
//		// petList.setSelectedIndex(2);
//
//		// }
//		f.add(label2, new GridBagConstraints(0, 1, 1, 1, 0, 0,
//				GridBagConstraints.LINE_START, 0, new Insets(-70, 0, 0, 0), 0,
//				0));
//		f.add(petList, new GridBagConstraints(1, 1, 1, 1, 0, 0,
//				GridBagConstraints.LINE_START, 0, new Insets(-75, 10, 0, 0), 0,
//				0));
//
//		// if(petList.getItemAt(0) instanceof Bmw){
//		TovarCar[] bmw = a.getCar()[0];
//		// ButtonGroup productsGroup = new ButtonGroup();
//
//		 pProducts = new JPanel();
//		 pProducts.setVisible(true);
//		pProducts.setLayout(new GridLayout(a.getCar()[0].length, 0));
//		pProducts.setBorder(BorderFactory.createLineBorder(Color.CYAN));
//
//		ActionListener rListener = new RBListener();
//		 productsGroup = new ButtonGroup();
//		for (int i = 0; i < a.getCar()[0].length; i++) {
//			JRadioButton rb = new JRadioButton(a.getCar()[0][i].getName());
//			rb.setActionCommand(String.valueOf(i));
//			rb.addActionListener(rListener);
//			if (i == 0) {
//				rb.setSelected(true);
//			}
//			productsGroup.add(rb);
//			pProducts.add(rb);
//
//		}
//		final JPanel pProducts1 = new JPanel();
//		pProducts1.setVisible(false);
//			pProducts1.setLayout(new GridLayout(a.getCar()[1].length, 0));
//			pProducts1.setBorder(BorderFactory.createLineBorder(Color.CYAN));
//
//			ActionListener rListener1 = new RBListener();
//			ButtonGroup	 productsGroup1 = new ButtonGroup();
//			for (int i = 0; i < a.getCar()[1].length; i++) {
//				JRadioButton rb = new JRadioButton(a.getCar()[1][i].getName());
//				rb.setActionCommand(String.valueOf(i));
//				rb.addActionListener(rListener);
//				if (i == 0) {
//					rb.setSelected(true);
//				}
//				productsGroup1.add(rb);
//				pProducts1.add(rb);
//
//			}
//			final JPanel pProducts2 = new JPanel();
//				pProducts2.setLayout(new GridLayout(a.getCar()[2].length, 0));
//				pProducts2.setBorder(BorderFactory.createLineBorder(Color.CYAN));
//				pProducts2.setVisible(false);
//				ActionListener rListener2 = new RBListener();
//				ButtonGroup productsGroup2 = new ButtonGroup();
//				for (int i = 0; i < a.getCar()[2].length; i++) {
//					JRadioButton rb = new JRadioButton(a.getCar()[2][i].getName());
//					rb.setActionCommand(String.valueOf(i));
//					rb.addActionListener(rListener);
//					if (i == 0) {
//						rb.setSelected(true);
//					}
//					productsGroup2.add(rb);
//					pProducts2.add(rb);
//
//				}
//
//
//		petList.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				// = Integer.parseInt(e.getActionCommand());
//				JComboBox cb = (JComboBox) e.getSource();
//				// String petName = (String);
////				cb.setSelectedIndex(1);
//
//				id = cb.getSelectedIndex();
//			if(id==0){
////
////			}
//				// pProducts.repaint();
////				f.removeAll();
////				f.setVisible(false);
////				createSellaPannel();
////				createF(id);
////				fram.repaint();
////				f.repaint();
//
//				pProducts.setVisible(true);
//				pProducts2.setVisible(false);
//				pProducts1.setVisible(false);
//			}
//			else if(id==1){
//				pProducts.setVisible(false);
//				pProducts2.setVisible(false);
//				pProducts1.setVisible(true);
//			}else{
//				pProducts.setVisible(false);
//				pProducts1.setVisible(false);
//				pProducts2.setVisible(true);
//			}
//			}
//
//		});
////		petList.addMouseListener(new CBox());
//
//
//
//
//		JLabel label3 = new JLabel("Amount of goods", JLabel.LEFT);
//		label3.setHorizontalTextPosition(JLabel.LEFT);
//		f.add(label3,
//				new GridBagConstraints(0, 2, 1, 1, 0, 0,
//						GridBagConstraints.LINE_START, 0, new Insets(10, 0, 0,
//								0), 0, 0));
//		NumberFormat nf = NumberFormat.getNumberInstance();
//		final JFormattedTextField tfCount = new JFormattedTextField(nf);
//		tfCount.setValue(1);
//
//		f.add(tfCount, new GridBagConstraints(1, 2, 1, 1, 0, 0,
//				GridBagConstraints.LINE_START, 0, new Insets(10, 10, 0, 0), 0,
//				0));
//		label1.setFont(new Font("Verdana", Font.BOLD, 10));
//
//		label2.setFont(new Font("Verdana", Font.BOLD, 10));
//
//		label3.setFont(new Font("Verdana", Font.BOLD, 10));
//
//		JButton b1 = new JButton("buy");
//		f.add(b1, new GridBagConstraints(1, 3, 1, 1, 0, 0, 21, 0, new Insets(5,
//				10, 0, 0), 0, 0));
//		b1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				if (tfName.getText().equals("")) {
//					JOptionPane.showConfirmDialog(null,
//							"please, enable your name", "Warning!!!",
//							JOptionPane.PLAIN_MESSAGE);
//				} else {
//					p = new Pokupatel();
//					p.setNameOfBuyer(tfName.getText());
//					// t1 = a.getTovar(prodIndex);
//					count = Integer.parseInt(tfCount.getText());
//
////					addInform();
//
//					fram.getContentPane().add(createSellaPannel1());
//
//				}
//			}
//		});
//
//		f1 = new JPanel();
//		f1.setLayout(new BorderLayout());
//		menuBar = new JMenuBar();
//		menu = new JMenu("File");
//		menuItem = new JMenuItem("create new transaction");
//		menuItem.addActionListener(new ActionListener(){
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//
//				fram.getContentPane().add(createSellaPannel());
//				jp.setVisible(false);
//				f2.setVisible(true);
//
//
//			}
//
//		});
//		menu.add(menuItem);
//		menuBar.add(menu);
//		f1.add("North", menuBar);
//
//		f2.add("North", f1);
//		f2.add("Center", f);
//
//		return f2;
//	}
//
//	public void createF(int u){
//		pProducts = new JPanel();
//		pProducts.setLayout(new GridLayout(a.getCar()[u].length, 0));
//		pProducts.setBorder(BorderFactory.createLineBorder(Color.CYAN));
//
//		ActionListener rListener = new RBListener();
//		 productsGroup = new ButtonGroup();
//		for (int i = 0; i < a.getCar()[u].length; i++) {
//			JRadioButton rb = new JRadioButton(a.getCar()[u][i].getName());
//			rb.setActionCommand(String.valueOf(i));
//			rb.addActionListener(rListener);
//			if (i == 0) {
//				rb.setSelected(true);
//			}
//			productsGroup.add(rb);
//			pProducts.add(rb);
//
//		}
//
//		final JPanel pProducts1 = new JPanel();
//		pProducts.setLayout(new GridLayout(a.getCar()[0].length, 0));
//		pProducts.setBorder(BorderFactory.createLineBorder(Color.CYAN));
//
//		ActionListener rListener1 = new RBListener();
//		ButtonGroup productsGroup1 = new ButtonGroup();
//		for (int i = 0; i < a.getCar()[1].length; i++) {
//			JRadioButton rb = new JRadioButton(a.getCar()[1][i].getName());
//			rb.setActionCommand(String.valueOf(i));
//			rb.addActionListener(rListener1);
//			if (i == 0) {
//				rb.setSelected(true);
//			}
//			productsGroup1.add(rb);
//			pProducts1.add(rb);
//
//		}
//
//		final JPanel pProducts2 = new JPanel();
//		pProducts.setLayout(new GridLayout(a.getCar()[0].length, 0));
//		pProducts.setBorder(BorderFactory.createLineBorder(Color.CYAN));
//
//		ActionListener rListener2 = new RBListener();
//		ButtonGroup productsGroup2 = new ButtonGroup();
//		for (int i = 0; i < a.getCar()[2].length; i++) {
//			JRadioButton rb = new JRadioButton(a.getCar()[2][i].getName());
//			rb.setActionCommand(String.valueOf(i));
//			rb.addActionListener(rListener2);
//			if (i == 0) {
//				rb.setSelected(true);
//			}
//			productsGroup2.add(rb);
//			pProducts2.add(rb);
//
//		}
//		if(id==0){
//			group = pProducts;
//		}else if(id==1){
//			group = pProducts1;
//		}else if(id==2){
//			group = pProducts2;
//		}
//		f.add(group,
//				new GridBagConstraints(2, 1, 1, 1, 0, 0,
//						GridBagConstraints.LINE_START, 0, new Insets(-5, 0, 0,
//								0), 0, 0));
//	}
//
//	public JPanel addInform() {
//		if (id1 != 0) {
//			inf.addObject();
//		} else {
//			inf = new Information();
//		}
//		return inf;
//
//	}
//
//	private JPanel createSellaPannel1() {
//		f2.setVisible(false);
//
//		jp = new JPanel();
//		jp.setVisible(true);
//		jp.setLayout(new BorderLayout());
//		JPanel jp1 = new JPanel();
//		jp.add("Center",jp1);
//		jp.add("North",f1);
//		fram.getContentPane().add(jp);
//		fram.pack();
//		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd/MMM/yyyy");
//		for (int i = j; i < obj.length; i++) {
//			Object[] co = new Object[] { new Integer(++id1),
//					sdf.format(new Date()),
//					a.getTovar(prodIndex).getName(), count,
//					p.getNameOfBuyer() };
//			obj[i] = co;
//
//			j++;
//			break;
//		}
//		table = new JTable(obj, s);
//		table.getColumnModel().getColumn(1).setPreferredWidth(120);
//		sp = new JScrollPane(table);
//		jp1.add(sp);
//		return jp;
//
//	}
//
//	public class Information extends JPanel {
//		private int j = 0;
//		private Object[][] obj = new Object[15][6];
//		private JTable table;
////		private JPanel jp;
//		private JScrollPane sp;
//		private String[] s = { "TID", "Date", "Product", "Count", "Costumer" };
////		private JFrame f;
//
//		public Information() {
////			f = new JFrame("Data");
////			setLayout(new BorderLayout());
////			f.setLocation(550, 400);
////			f.setMinimumSize(new Dimension(700, 250));
////			f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
////			f.getContentPane().add(this);
////			f.pack();
////			f.setVisible(true);
//
//			fram.getContentPane().add(this);
//			fram.setVisible(true);
//			addObject();
//		}
//
//		public void addObject() {
//			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd/MMM/yyyy");
//			for (int i = j; i < obj.length; i++) {
//				Object[] co = new Object[] { new Integer(++id1),
//						sdf.format(new Date()),
//						a.getTovar(prodIndex).getName(), count,
//						p.getNameOfBuyer() };
//				obj[i] = co;
//				this.repaint();
//				j++;
//				break;
//			}
//
//		}
//
//		@Override
//		public void paintComponent(Graphics g) {
//			// TODO Auto-generated method stub
//			super.paintComponents(g);
//			table = new JTable(obj, s);
//			table.getColumnModel().getColumn(1).setPreferredWidth(120);
//			sp = new JScrollPane(table);
//			add(sp);
//		}
//
//	}
//
//	public TovarCar[] printCar(TovarCar[][] car) {
//		TovarCar[] car1 = new TovarCar[3];
//		for (TovarCar[] j : car) {
//			fillCar(j, car1);
//		}
//		return car1;
//
//	}
//
//	private void fillCar(TovarCar[] car, TovarCar[] car1) {
//		for (int i = 0; i < car.length; i++) {
//			if (car1[i] == null) {
//				car1[i] = car[i];
//				break;
//			}
//		}
//	}
//
//	public void paintComponent(Graphics g) {
//		g.setColor(Color.BLUE);
//		g.fillRect(0, 0, 500, 400);
//	}
//
//	public class RBListener implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			prodIndex = Integer.parseInt(e.getActionCommand());
//
//		}
//
//	}
//
////	public class CBox implements MouseListener {
////
////		@Override
////		public void mouseClicked(MouseEvent e) {
////			// TODO Auto-generated method stub
////			id = 2;
////			pProducts.repaint();
////			createSellaPannel().repaint();
////		}
////
////		@Override
////		public void mousePressed(MouseEvent e) {
////			// TODO Auto-generated method stub
////			id = 2;
////			pProducts.repaint();
////		}
////
////		@Override
////		public void mouseReleased(MouseEvent e) {
////			// TODO Auto-generated method stub
////			id = 2;
////			pProducts.repaint();
////		}
////
////		@Override
////		public void mouseEntered(MouseEvent e) {
////			// TODO Auto-generated method stub
////			id = 2;
////			pProducts.repaint();
////		}
////
////		@Override
////		public void mouseExited(MouseEvent e) {
////			// TODO Auto-generated method stub
////			id = 2;
////			pProducts.repaint();
////		}
//
//		// @Override
//		// public void actionPerformed(ActionEvent e) {
//		// // TODO Auto-generated method stub
//		// // = Integer.parseInt(e.getActionCommand());
//		// JComboBox cb = (JComboBox)e.getSource();
//		// // String petName = (String)cb.getSelectedItem();
//		// id = cb.getSelectedIndex();
//		// pProducts.repaint();
//		// createSellaPannel().repaint();
//		//
//		// }
//
////	}
//}
