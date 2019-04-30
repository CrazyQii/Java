package com.hanlq.calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javafx.scene.layout.Border;

//����JFrame��һ������FrameWithPanel
//��JFrame��������JPanel����
class FrameWithPanel extends JFrame {
	//��ʼ�����㰴ť���ı���
	private JTextField result_field = new JTextField(20);
	private JButton button_clear = new JButton("Clear");
	
	//��ʼ�����ֺ��������ť
	private JButton button0 = new JButton("0");
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");
	private JButton button_dian = new JButton(".");
	private JButton button_jia = new JButton("+");
	private JButton button_jian = new JButton("-");
	private JButton button_cheng = new JButton("*");
	private JButton button_chu = new JButton("/");
	private JButton button_deng = new JButton("=");
	
	private double a1;
	private double a2;
	private double result = 0;
	
	//���췽��
	public FrameWithPanel() {
		//��Ʋ��֣�����JPanel����
		//һ��JPanel����������clear����һ��JPanel�������ּ����߼���
		
		//������һ��JPanel����
		JPanel topPan = new JPanel();
		
		//��������������ť����
		topPan.setLayout(new BorderLayout());
		topPan.add(result_field, BorderLayout.WEST);
		topPan.add(button_clear, BorderLayout.EAST);
		
		//�����ڶ���JPanel����
		JPanel bottomPan = new JPanel();
		//����pan�ļ��
		bottomPan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		//�������ְ�ť����ͬʱ��Ӱ�ť
		bottomPan.setLayout(new GridLayout(4, 4, 5, 5));
		bottomPan.add(button7);
		bottomPan.add(button8);
		bottomPan.add(button9);
		bottomPan.add(button_chu);
		bottomPan.add(button4);
		bottomPan.add(button5);
		bottomPan.add(button6);
		bottomPan.add(button_cheng);
		bottomPan.add(button1);
		bottomPan.add(button2);
		bottomPan.add(button3);
		bottomPan.add(button_jia);
		bottomPan.add(button0);
		bottomPan.add(button_dian);
		bottomPan.add(button_jian);
		bottomPan.add(button_deng);
		
		//������������ӵ�Frame����
		add(topPan, BorderLayout.NORTH);
		add(bottomPan, BorderLayout.CENTER);
		
		//����¼�����
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(((JButton)e.getSource()).getText());
			}
		});
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(((JButton)e.getSource()).getText());
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(((JButton)e.getSource()).getText());
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(((JButton)e.getSource()).getText());
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(((JButton)e.getSource()).getText());
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(((JButton)e.getSource()).getText());
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(((JButton)e.getSource()).getText());
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(((JButton)e.getSource()).getText());
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(((JButton)e.getSource()).getText());
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(((JButton)e.getSource()).getText());
			}
		});
		
		
	}
}


public class Calculator {

	public static void main(String[] args) {
		//ʵ����frame���������
		FrameWithPanel frame = new FrameWithPanel();
		//���ô�������
		frame.setTitle("Calculator");
		//��ܹر�ʱ��������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ÿ�ܴ�С
		frame.setSize(300, 300);
		//��ʾ���
		frame.setVisible(true);
	}

}
