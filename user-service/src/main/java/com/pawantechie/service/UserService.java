package com.pawantechie.service;

import com.pawantechie.VO.RestTemplateVO;
import com.pawantechie.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	public RestTemplateVO getUserWithDepartment(Long userId);
	
}
