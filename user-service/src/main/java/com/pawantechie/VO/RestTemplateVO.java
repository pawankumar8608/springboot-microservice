package com.pawantechie.VO;

import com.pawantechie.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestTemplateVO {
	
	public User user;
	public Department department;

}
