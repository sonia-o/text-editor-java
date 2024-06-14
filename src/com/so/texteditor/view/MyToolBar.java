package com.so.texteditor.view;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class MyToolBar extends JToolBar{
	
	private JButton openFileButton;
	private JButton saveFileButton;
	
	public MyToolBar() {
		openFileButton = new JButton("Open File");
		saveFileButton = new JButton("Save File");
		
		add(openFileButton);
		add(saveFileButton);
	}
}
