/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodom;

/**
 *
 * @author Phan Quang Anh
 */
public class Book {
    private String id;
    private String autor;
    private String title;
    private String genre;
    private float price;
    private String publish_date;    
    private String description;
    
    public Book() {
    }

    public Book(String id, String autor, String title, String genre, float price, String publish_date, String description) {
        this.id = id;
        this.autor = autor;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publish_date = publish_date;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "book{" + "id=" + id + ", author=" + autor + ", title=" + title + ", genre=" + genre + ", price=" + price + ", publish_date=" + publish_date + ", description=" + description + '}' ;
    }
// tml Hieu
    //dcm phan anh
}
