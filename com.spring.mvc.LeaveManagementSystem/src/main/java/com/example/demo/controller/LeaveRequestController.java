package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.LeaveRequest;
import com.example.demo.service.LeaveRequestService;

@Controller
public class LeaveRequestController {
	public LeaveRequestService leaveRequestService;
	public LeaveRequestController(LeaveRequestService leaveRequestService) {
		this.leaveRequestService = leaveRequestService;
	}
	
	@GetMapping("leaveApply")
	public String leaveApplyMapping(Model model) {
		model.addAttribute("leaveRequest",new LeaveRequest());
		return "leaveApply";
	}
	
}
