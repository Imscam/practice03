package com.sangin.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangin.admin.service.AdminService;

@Controller
@RequestMapping("/board")
public class AdminController{
	
	@Autowired
	private AdminService service;
	
	@GetMapping("/list.do")
	public String list(Model model) {
		model.addAttribute("list", service.list());
		return "board/list";
	}
	/**
	@GetMapping("/view.do")
	public String view(int clothNum, Model model) {
		model.addAttribute("vo", service.view(clothNum));
		return "board/view";
	}
	**/
	
	
	@RequestMapping(value="/view.do/{clothNum}")
	public String read(Model model, @PathVariable Long clothNum) {
		
			model.addAttribute("vo", service.view(clothNum));
			return "board/view";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(@RequestParam("no") Long clothNum) {
		service.delete(clothNum);
		return "redirect:/board/list.do";
	}
	
}
