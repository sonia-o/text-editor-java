package com.so.texteditor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.so.texteditor.model.TextEditorModel;

public class SaveFileAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		JFileChooser fileChooserDialog = new JFileChooser();
		int returnValue = fileChooserDialog.showSaveDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			try {
				String textToSave = TextEditorModel.getText();
				File fileChecker = new File(fileChooserDialog.getSelectedFile().getAbsolutePath());
				if (fileChecker.exists()) {
					System.out.println("File already exists.");
					int returnValue1 = JOptionPane.showConfirmDialog(null, "File already exists. Are you sure you want to override?", "Save Warning", JOptionPane.YES_NO_OPTION);
					if (returnValue1 == JOptionPane.YES_OPTION) {
						BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooserDialog.getSelectedFile().getAbsolutePath()));
						writer.write(textToSave);
						writer.close();
					} 
				} else {
					BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooserDialog.getSelectedFile().getAbsolutePath()));
					writer.write(textToSave);
					writer.close();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
