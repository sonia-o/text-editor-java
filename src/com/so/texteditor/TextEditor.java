package com.so.texteditor;

import javax.swing.SwingUtilities;

import com.so.texteditor.view.MainWindow;

public class TextEditor {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MainWindow app = new MainWindow();
			app.setVisible(true);
		});
	}
	
}
