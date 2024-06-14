package com.so.texteditor.model;

public class TextEditorModel {

	private static String text = "";

	public static String getText() {
		return text;
	}

	public static void setText(String text) {
		TextEditorModel.text = text;
	}
	
}
