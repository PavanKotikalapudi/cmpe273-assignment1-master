package edu.sjsu.cmpe.library.domain;

public class Review {

	
	
	private long id;
	private int rating;
	private String comment;
	
	
	public long getReviewId(){
		return id;
	}
	
	public void setReviewId(long id){
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

