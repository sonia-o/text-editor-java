package com.so.texteditor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

import com.so.texteditor.model.TextEditorModel;
import com.so.texteditor.view.MainWindow;

public class OpenFileAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		JFileChooser fileChooserDialog = new JFileChooser();
		int returnValue = fileChooserDialog.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			try {
				BufferedReader reader = new BufferedReader(
						new FileReader(fileChooserDialog.getSelectedFile().getAbsolutePath()));
				String line = reader.readLine();
				String text = "";
				while (line != null) {
					text += line + "\n";
					line = reader.readLine();
				}
				reader.close();
				TextEditorModel.setText(text);
				MainWindow.refreshText();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
