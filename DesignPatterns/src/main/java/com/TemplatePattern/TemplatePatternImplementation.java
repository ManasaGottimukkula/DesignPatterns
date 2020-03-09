package com.TemplatePattern;

public class TemplatePatternImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Data Processing of EXCELFile---");
		ExcelFileData excel = new ExcelFileData();
		excel.readProcessAndSaveData();
		System.out.println();
		System.out.println("---Data Processing of TEXTFile---");
		TextFileData text = new TextFileData();
		text.readProcessAndSaveData();

	}

}
