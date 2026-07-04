package com.nit.beans;

public class Document {
	private int documentId;
	private String documentName;
	private String sourceLanguage;
	private String targetLanguage;
	private int wordCount;

	public Document(int documentId, String documentName, String sourceLanguage, String targetLanguage, int wordCount) {
		this.documentId = documentId;
		this.documentName = documentName;
		this.sourceLanguage = sourceLanguage;
		this.targetLanguage = targetLanguage;
		this.wordCount = wordCount;
	}

	public String getDocumentName() {
		return documentName;
	}

	public String getSourceLanguage() {
		return sourceLanguage;
	}

	public String getTargetLanguage() {
		return targetLanguage;
	}

	public int getWordCount() {
		return wordCount;
	}
}
