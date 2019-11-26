package com.techtalentsouth.NeverAnonymous.ForumPost;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForumPostController {

	@GetMapping(value="/")
	public String index(ForumPost forumPost) {
		return "forumpost/index";
	}
}
