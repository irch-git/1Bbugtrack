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
@RequestMapping("/")
public class DashboardController {
	
	@Autowired
	IMemberRepository memRepo;
	
	@GetMapping
	public String displayDashboard(Model model) {
		
		MemberEntity dashboardMemberHtml = new MemberEntity();
		model.addAttribute("addMemberHtml", dashboardMemberHtml);
		
		List<MemberEntity> memberController = memRepo.findAll();
		model.addAttribute("memberHtmlController", memberController);
		
		return "main/dashboard";
	}
	
	@PostMapping("/saved")
	public String dashboardSaved(Model model, MemberEntity dashboardMemberHtml) {
		
		memRepo.save(dashboardMemberHtml);
		
		return "redirect:/";
	}
}
