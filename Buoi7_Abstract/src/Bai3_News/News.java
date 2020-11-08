package Bai3_News;

import java.util.Scanner;

public class News implements INews{

    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

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

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", averageRate=" + averageRate +
                '}';
    }

    @Override
    public void Display() {
        System.out.println("Day news: ");
        System.out.println("ID: "+getId());
        System.out.println("Title: "+ getTitle());
        System.out.println("publish date: "+getPublishDate());
        System.out.println("Author: "+getAuthor());
        System.out.println("Content: "+ getContent());
        System.out.println("Average Rate: "+getAverageRate());
    }
    int[] rateList = new int[3];
    public void InputaverageRate() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<3;i++) {
            System.out.println("rate number: "+i+": ");
            rateList[i] = sc.nextInt();
        }
    }
    public void Caculate() {
        int S = 0;
        for(int i = 0;i<3;i++){
            S += rateList[i];
        }
        this.averageRate = (float) (S/3.0);
    }
}
