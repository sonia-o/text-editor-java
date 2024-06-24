package com.so.texteditor.view;

import javax.swing.JButton;
import javax.swing.JToolBar;

import com.so.texteditor.controller.OpenFileAction;
import com.so.texteditor.controller.SaveFileAction;

public class MyToolBar extends JToolBar{
	
	private JButton openFileButton;
	private JButton saveFileButton;
	
	public MyToolBar() {
		openFileButton = new JButton("Open File");
		openFileButton.addActionListener(new OpenFileAction());
		saveFileButton = new JButton("Save File");
		saveFileButton.addActionListener(new SaveFileAction());
		
		add(openFileButton);
		add(saveFileButton);
	}
}
