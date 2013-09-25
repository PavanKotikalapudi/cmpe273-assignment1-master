package edu.sjsu.cmpe.library.domain;

public class Review {

	
	
	private int id;
	private int rating;
	private String comment;
	
	
	public long getReviewId(){
		return id;
	}
	
	public void setReviewId(int id){
		this.id=id;
	}
	
	
	
	public int getRating(){
		return rating;
	}
	
	public void setRating(int stars){
		rating=stars;
	}
	
	
	public String getComment(){
		return comment;
	}
	
	public void setComment(String comment){
		this.comment=comment;
	}
	
	
}

