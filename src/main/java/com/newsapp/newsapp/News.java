package com.newsapp.newsapp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "news_article")
public class News {
    @Id
    public String id;

    public String title;
    public String summary;
    public String text;
    public String image_url;
    public String source;
    public String link;
    public List<String> keywords;
    public String author;
    public Integer truth_value;
    public String publish_date;

    public News()
    {
        super();
    }

    public News(
            String title,
            String summary,
            String text,
            String image_url,
            String source,
            String link,
            List<String> keywords,
            String author,
            Integer truth_value,
            String publish_date )
    {
        super();
        this.title = title;
        this.summary = summary;
        this.text = text;
        this.image_url = image_url;
        this.source = source;
        this.link = link;
        this.keywords = keywords;
        this.author = author;
        this.truth_value = truth_value;
        this.publish_date = publish_date;
    }
    @Override
    public String toString() {
        return String.format(
                "News[id=%s, title='%s']",
                id, title);
    }
}