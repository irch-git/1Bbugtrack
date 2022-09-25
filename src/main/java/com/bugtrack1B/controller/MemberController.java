package com.bugtrack1B.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {
	
	public String displayForm() {
		
		return "member/new-member";
	}
}
