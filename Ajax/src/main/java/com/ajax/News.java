package com.ajax;

public class News {
    private String date;
    private String source;
    private String content;
    private String title;

    public News(String date, String source, String content, String title) {
        this.date = date;
        this.source = source;
        this.content = content;
        this.title = title;
    }

    public News() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
