package com.pawantechie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.pawantechie.VO.Department;
import com.pawantechie.VO.RestTemplateVO;
import com.pawantechie.entity.User;
import com.pawantechie.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		log.info("Inside saveUser() method of UserService");
		return userRepository.save(user);
	}

	@Override
	public RestTemplateVO getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment() method of UserService");
		RestTemplateVO restTemplateVO = new RestTemplateVO();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDeptId(), Department.class);
		restTemplateVO.setUser(user);
		restTemplateVO.setDepartment(department);
		return restTemplateVO;
	}

}
