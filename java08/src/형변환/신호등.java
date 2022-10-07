package 형변환;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 신호등 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_2 = new JButton("짜장면");
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			JLabel img = new JLabel();
			ImageIcon icon = new ImageIcon("짜장면.jpg");
			img.setIcon(icon);
			f.getContentPane().add(img);
			f.setVisible(true);
			}
		});
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("짬뽕");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img1 = new JLabel();
				ImageIcon icon1 = new ImageIcon("짬뽕.jpg");
				img1.setIcon(icon1);
				f.getContentPane().add(img1);
				f.setVisible(true);
				
			}
		});
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("탕수육");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img2 = new JLabel();
				ImageIcon icon2 = new ImageIcon("탕수육.jpg");
				
				img2.setIcon(icon2);
				f.getContentPane().add(img2);
				
				f.setVisible(true);
			}
		});
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
	}

}
