package com.so.texteditor.controller;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

import com.so.texteditor.model.TextEditorModel;

public class MainTextListener implements DocumentListener {

	@Override
	public void insertUpdate(DocumentEvent e) {
		try {
			TextEditorModel.setText(e.getDocument().getText(0, e.getDocument().getLength()));
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		try {
			TextEditorModel.setText(e.getDocument().getText(0, e.getDocument().getLength()));
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		
		
	}

}
