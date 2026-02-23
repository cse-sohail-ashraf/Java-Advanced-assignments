package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.LeaveRequest;
import com.example.demo.repository.LeaveRequestRepository;

@Service
public class LeaveRequestService {
	public LeaveRequestRepository leaveRequestRepository;
	public LeaveRequestService(LeaveRequestRepository leaveRequestRepository) {
		this.leaveRequestRepository = leaveRequestRepository;
	}
	
	public void saveLeaveRequest(LeaveRequest leaveRequest) {
		leaveRequestRepository.save(leaveRequest);
	}
	
	public List<LeaveRequest> fetchLeaveRequest(){
		return leaveRequestRepository.findAll();
	}
}
