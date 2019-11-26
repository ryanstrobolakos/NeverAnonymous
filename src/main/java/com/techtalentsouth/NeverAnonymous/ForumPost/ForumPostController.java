package com.techtalentsouth.NeverAnonymous.ForumPost;

import org.springframework.stereotype.Controller;

@Controller
public class ForumPostController {

	public String index(ForumPost forumPost) {
		return "forumpost/index";
	}
}
