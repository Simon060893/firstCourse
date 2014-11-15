package com.midgarb.day8.sort;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.midgarb.day5.hw1.domain.Pokupatel;
import com.midgarb.day5.hw1.domain.TovarCar;
import com.midgarb.day8.sort.copy.Action;


public class Sort {
	Graphics g;
	private Action a;
	private int prodIndex = 0;
	private int id = 0;
	JPanel pProducts;

	public Sort() {
		JFrame f = new JFrame("Sort of car");
		f.setLocation(100, 150);
		f.setMinimumSize(new Dimension(700, 320));
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.getContentPane().add(createSellaPannel());
		f.pack();
		f.setVisible(true);

	}



	private JPanel createSellaPannel() {

		a = new Action();
		JPanel f = new JPanel();
		f.setLayout(new GridBagLayout());
		JLabel label1 = new JLabel("Name of buyer", JLabel.LEFT);
		final JTextField tfName = new JTextField(10);
		f.add(label1, new GridBagConstraints(0, 0, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, GridBagConstraints.NONE,
				new Insets(-40, 0, 0, 0), 0, 0));
		f.add(tfName, new GridBagConstraints(1, 0, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, 0, new Insets(-40, 10, 0, 0),
				100, 0));
		// System.out.println();
		JLabel label2 = new JLabel("Choose the goods");

		ButtonGroup productsGroup = new ButtonGroup();
		// String[] s ={"Bmw","Audi","Mosk"};
		JComboBox petList = new JComboBox(printCar(a.getCar()));
		// petList.setSelectedIndex(0);
		petList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// = Integer.parseInt(e.getActionCommand());
				JComboBox cb = (JComboBox) e.getSource();
				// String petName = (String);
				cb.setSelectedIndex(1);
				id = cb.getSelectedIndex();

				// pProducts.repaint();
				createSellaPannel().repaint();

			}

		});
		petList.addMouseListener(new CBox());

		final JPanel pProd = new JPanel();
		// ActionListener chListener = new CBox();
		// for (int i = 0; i<a.getCar().length;i++) {
		// petList.setActionCommand(String.valueOf(i));
		// petList.addActionListener(chListener);
		// if(i==0){
		// petList.setSelectedItem(true);
		// }
		// productsGroup.add(petList);
		pProd.add(petList);

		// petList.setSelectedIndex(2);

		// }
		f.add(label2, new GridBagConstraints(0, 1, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, 0, new Insets(-70, 0, 0, 0), 0,
				0));
		f.add(petList, new GridBagConstraints(1, 1, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, 0, new Insets(-75, 10, 0, 0), 0,
				0));

		// if(petList.getItemAt(0) instanceof Bmw){
//		TovarCar[] bmw = a.getCar()[0];
//		ButtonGroup productsGroup = new ButtonGroup();
		pProducts = new JPanel();
		pProducts.setLayout(new GridLayout(a.getCar().size(), 0));
		pProducts.setBorder(BorderFactory.createLineBorder(Color.CYAN));

		ActionListener rListener = new RBListener();

		for (int i = 0; i < a.getCar().size(); i++) {
            JRadioButton rb;
            rb = new JRadioButton(a.getCar().get(i).getName());
            rb.setActionCommand(String.valueOf(i));
            rb.addActionListener(rListener);
            if (i == 0) {
                rb.setSelected(true);
            }
            productsGroup.add(rb);
            pProducts.add(rb);
		}

		f.add(pProducts,
				new GridBagConstraints(2, 1, 1, 1, 0, 0,
						GridBagConstraints.LINE_START, 0, new Insets(-5, 0, 0,
								0), 0, 0));

		// }

		JLabel label3 = new JLabel("Amount of goods", JLabel.LEFT);
		label3.setHorizontalTextPosition(JLabel.LEFT);
		f.add(label3,
				new GridBagConstraints(0, 2, 1, 1, 0, 0,
						GridBagConstraints.LINE_START, 0, new Insets(10, 0, 0,
								0), 0, 0));
		NumberFormat nf = NumberFormat.getNumberInstance();
		final JFormattedTextField tfCount = new JFormattedTextField(nf);
		tfCount.setValue(1);

		f.add(tfCount, new GridBagConstraints(1, 2, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, 0, new Insets(10, 10, 0, 0), 0,
				0));
		label1.setFont(new Font("Verdana", Font.BOLD, 10));

		label2.setFont(new Font("Verdana", Font.BOLD, 10));

		label3.setFont(new Font("Verdana", Font.BOLD, 10));

		JButton b1 = new JButton("buy");
		f.add(b1, new GridBagConstraints(1, 3, 1, 1, 0, 0, 21, 0, new Insets(5,
				10, 0, 0), 0, 0));
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (tfName.getText().equals("")) {
					JOptionPane.showConfirmDialog(null,
							"please, enable your name", "Warning!!!",
							JOptionPane.PLAIN_MESSAGE);
				} else {
					Pokupatel p = new Pokupatel();
					p.setNameOfBuyer(tfName.getText());
					TovarCar t1 = a.getCar().get(prodIndex);
					int count = Integer.parseInt(tfCount.getText());
					a.sell(t1, p.getNameOfBuyer(), count);
				}
			}
		});

		return f;
	}

	public List<TovarCar> printCar(List<TovarCar> car) {
        List<TovarCar> car1 = new ArrayList<>();
		for (int i =0 ; i < car.size(); i++) {
			fillCar(car.get(i), car1);
		}
		return car1;

	}

	private void fillCar(TovarCar car, List<TovarCar> car1) {
		for (int i = 0; i < car.size(); i++) {
			if ( !car1.get(i).getClass().getComponentType().getClass().getSimpleName().equals(car.getClass().getSimpleName())) {
                car1.add(car);
				break;
			}
		}
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 400);
	}

	public class RBListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			prodIndex = Integer.parseInt(e.getActionCommand());

		}

	}

	public class CBox implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			id = 2;
			pProducts.repaint();
			createSellaPannel().repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			id = 2;
			pProducts.repaint();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			id = 2;
			pProducts.repaint();
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			id = 2;
			pProducts.repaint();
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			id = 2;
			pProducts.repaint();
		}

		// @Override
		// public void actionPerformed(ActionEvent e) {
		// // TODO Auto-generated method stub
		// // = Integer.parseInt(e.getActionCommand());
		// JComboBox cb = (JComboBox)e.getSource();
		// // String petName = (String)cb.getSelectedItem();
		// id = cb.getSelectedIndex();
		// pProducts.repaint();
		// createSellaPannel().repaint();
		//
		// }

	}
}
