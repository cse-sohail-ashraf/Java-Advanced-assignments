package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.LeaveType;
import com.example.demo.service.LeaveTypeService;

@Controller
public class LeaveTypeController {
	public LeaveTypeService leaveTypeService;
	public LeaveTypeController(LeaveTypeService leaveTypeService) {
		this.leaveTypeService = leaveTypeService;
	}
	
	@GetMapping("/addLeaveType")
	public String addLeaveTypeMapper(Model model) {
		model.addAttribute("newLeave",new LeaveType());
		return "addLeaveType";
	}
	
	@GetMapping("/viewLeaveTypes")
	public String viewLeaveTypeMapper(Model model) {
		List<LeaveType> leaveTypeList = leaveTypeService.fetchLeaveTye();
		model.addAttribute("leaveTypeList",leaveTypeList);
		return "viewLeaveTypes";
	}
	
	@PostMapping("/saveLeaveType")
	public String saveLeaveType(LeaveType leaveType) {
		leaveTypeService.saveLeaveType(leaveType);
		return "redirect:/viewLeaveTypes";
	}
	
}
