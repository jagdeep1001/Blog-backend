package com.casestudy2.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class blogs {
    @Id
    @GeneratedValue
    private Long blog_id;
    private String blog_name;
    private String blog_desc;

    public String getBlog_content() {
        return blog_content;
    }

    public void setBlog_content(String blog_content) {
        this.blog_content = blog_content;
    }

    private String blog_content;
    private String blog_img;
    private String blog_author;
    private String blog_category;
    private Date date=new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(Long blog_id) {
        this.blog_id = blog_id;
    }

    public String getBlog_name() {
        return blog_name;
    }

    public void setBlog_name(String blog_name) {
        this.blog_name = blog_name;
    }

    public String getBlog_desc() {
        return blog_desc;
    }

    public void setBlog_desc(String blog_desc) {
        this.blog_desc = blog_desc;
    }

    public String getBlog_img() {
        return blog_img;
    }

    public void setBlog_img(String blog_img) {
        this.blog_img = blog_img;
    }

    public String getBlog_author() {
        return blog_author;
    }

    public void setBlog_author(String blog_author) {
        this.blog_author = blog_author;
    }

    public String getBlog_category() {
        return blog_category;
    }

    public void setBlog_category(String blog_category) {
        this.blog_category = blog_category;
    }
}
