package com.techtalentsouth.NeverAnonymous.ForumPost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ForumPostController {
	
	@Autowired
	private ForumPostRepository forumPostRepository;

	@GetMapping(value="/")
	public String index(ForumPost forumPost) {
		return "forumpost/index";
	}
	
	private ForumPost forumPost;
	
	@PostMapping(value="/")
	public String create(ForumPost forumPost, Model model) {
		forumPostRepository.save(new ForumPost(forumPost.getTitle(), forumPost.getAuthor(), 
		forumPost.getForumEntry()));
		model.addAttribute("title", forumPost.getTitle());
		model.addAttribute("author", forumPost.getAuthor());
		model.addAttribute("forumEntry", forumPost.getForumEntry());
		return "blogpost/result";
	}
	
}
