package com.bugtrack1B.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtrack1B.DAO.IMemberRepository;
import com.bugtrack1B.entity.MemberEntity;

@Controller
@RequestMapping("/members")
public class MemberController {
	
	@Autowired
	IMemberRepository memRepo;
	
	@GetMapping("/new")
	public String displayForm(Model model) {
		
		MemberEntity addMember = new MemberEntity();
		
		model.addAttribute("addMemberHtml", addMember);
		
		return "member/new-member";
	}
	
	@PostMapping("/saved")
	public String savedForm(Model model, MemberEntity addMemberHtml) {
		
		memRepo.save(addMemberHtml);
		
		return "redirect:/members";
	}
	
	@GetMapping
	public String displayData(Model model) {
		
		List<MemberEntity> memberController = memRepo.findAll();
		
		model.addAttribute("memberHtmlController", memberController);
		
		return "member/list-member";
	}
}
