package model;

import java.sql.Timestamp;

public class Document {
    private int id;
    private String title;
    private String author;
    private String field;
    private String note;
    private String keywords;
    private String content;
    private int userId;
	private Timestamp archivedDate;
	private String originalDocId;
	private String topic;
	

    public Document(int id, String title, String author, String field, String note, String keywords, String content, int userId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.field = field;
        this.note = note;
        this.keywords = keywords;
        this.content = content;
        this.userId = userId;
        this.topic = "";
    }

    
    public Document(int int1, String string, String string2, String string3, String string4, String string5,
			String string6, int int2, short short1) {
		// TODO Auto-generated constructor stub
	}

	public Document(int int1, String string, String string2, String string3, String string4, String string5,
			String string6, int int2, String string7) {
		// TODO Auto-generated constructor stub
	}

	public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isOwnedBy(int userId) {
        return this.userId == userId;
    }



    public String getOriginalDocId() {
        return originalDocId;
    }

    public void setOriginalDocId(String originalDocId) {
        this.originalDocId = originalDocId;
    }

    public Timestamp getArchivedDate() {
        return archivedDate;
    }

    public void setArchivedDate(Timestamp archivedDate) {
        this.archivedDate = archivedDate;
    }
}