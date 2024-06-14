package com.so.texteditor.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.so.texteditor.model.TextEditorModel;

public class MainWindow extends JFrame {
	
	JPanel mainPanel;
	MyToolBar toolBar;
	JTextArea textArea;
	
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);
		
		toolBar = new MyToolBar();
		mainPanel.add(toolBar, BorderLayout.NORTH);
		
		textArea = new JTextArea();
		textArea.setText(TextEditorModel.getText());
		
		JScrollPane scroller = new JScrollPane(textArea);
		JScrollBar bar = new JScrollBar();
		scroller.add(bar);
		mainPanel.add(scroller, BorderLayout.CENTER);
		
	}
}
