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

	public ForumPost(String author, String title, String forumEntry) {
		this.author = author;
		this.title = title;
		this.forumEntry = forumEntry;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getForumEntry() {
		return forumEntry;
	}

	public void setForumEntry(String forumEntry) {
		this.forumEntry = forumEntry;
	}

	@Override
	public String toString() {
		return "ForumPost [id=" + id + ", author=" + author + ", title=" + title + ", forumEntry=" + forumEntry + "]";
	}
	
}
