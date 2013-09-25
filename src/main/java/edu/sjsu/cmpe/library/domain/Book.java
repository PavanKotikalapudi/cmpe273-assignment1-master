package edu.sjsu.cmpe.library.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Book {
    private long isbn;
    private String title;
    @JsonProperty("publication-date")
    private String publicationDate;
    
    private String language;
    @JsonProperty("num-pages")
    private int numberOfPages;
    private String status="available";
    private ArrayList<Author> authors;
    

    /**
     * @return the isbn
     */
    public long getIsbn() {
	return isbn;
    }

    /**
     * @param isbn
     *            the isbn to set
     */
    public void setIsbn(long isbn) {
	this.isbn = isbn;
    }

    /**
     * @return the title
     */
    public String getTitle() {
	return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(String title) {
	this.title = title;
    }
    
    
    
    public String getPublicationDate(){
    	return publicationDate;
    }
    
    public void setPublicationDate(String date){
    	publicationDate=date;
    }
    
    
    
    public String getLanguage(){
    	return language;
    }
    
    public void setLanguage(String lang){
    	language=lang;
    }
    
    
    public int getNumberOfPages(){
    	return numberOfPages;
    }
    
    public void setNumberOfPages(int nop){
    	numberOfPages=nop;
    }
    
    
    
    public String getStatus(){
    	return status;
    }
    
    public void setStatus(String status){
    	this.status=status;
    }
    
    public ArrayList<Author> getAuthors(){
    	return authors;
    }
    
    public void setAuthors(ArrayList<Author> authors){
    	this.authors=authors;
    }
}
