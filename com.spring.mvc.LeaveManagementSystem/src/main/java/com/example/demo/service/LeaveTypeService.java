package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.LeaveType;
import com.example.demo.repository.LeaveTypeRepository;

@Service
public class LeaveTypeService {
	LeaveTypeRepository leaveTypeRepository;
	public LeaveTypeService(LeaveTypeRepository leaveTypeRepository) {
		this.leaveTypeRepository = leaveTypeRepository;
	}
	
	public void saveLeaveType(LeaveType leaveType) {
		leaveTypeRepository.save(leaveType);
	}
	
	public List<LeaveType> fetchLeaveTye(){
		return leaveTypeRepository.findAll();
	}
}
