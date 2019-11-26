package com.techtalentsouth.NeverAnonymous.ForumPost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ForumPost {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String author;
	private String title;
	private String forumEntry;
	
	public ForumPost() {
		
	}
	
	
}
