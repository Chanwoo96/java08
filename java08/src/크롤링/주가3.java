package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class 주가3 {
	private static JTextField t1;
	static JTextArea ta;
	public static void main(String[] args) {
	
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(400, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("code");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(74, 162, 208, 35);
		f.getContentPane().add(lblNewLabel);
		
		ta = new JTextArea();
		ta.setBounds(88, 332, 208, 142);
		f.getContentPane().add(ta);
		
		t1 = new JTextField();
		t1.setBounds(84, 207, 208, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton b1 = new JButton("삼성전자");
		b1.setBackground(Color.BLUE);
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				크롤링연습2 크롤링 = new 크롤링연습2();
				String result = 크롤링.naver("005930");
				ta.setText(result); 			
			}});
		b1.setBounds(112, 10, 143, 36);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("SK하이닉스");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습2 크롤링 = new 크롤링연습2();
				String result = 크롤링.naver("000660");
				ta.setText(result);
				t1.setText("000660");
			}
		});
		b2.setBackground(Color.RED);
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		b2.setBounds(112, 56, 143, 42);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("카카오");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습2 크롤링 = new 크롤링연습2();
				String result = 크롤링.naver("035720");
				ta.setText(result);
				t1.setText("035720");
			}
		});
		b3.setBackground(Color.YELLOW);
		b3.setFont(new Font("굴림", Font.BOLD, 20));
		b3.setBounds(112, 108, 143, 44);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("크롤링 시작");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code= t1.getText();
				크롤링연습2 크롤링 = new 크롤링연습2();
				String result = 크롤링.naver(code);
				ta.setText(result);
			}
		});
		b4.setBackground(Color.GREEN);
		b4.setFont(new Font("굴림", Font.BOLD, 20));
		b4.setBounds(112, 250, 143, 49);
		f.getContentPane().add(b4);
		f.setVisible(true);
	}
}
