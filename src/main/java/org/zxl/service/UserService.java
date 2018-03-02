package org.zxl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zxl.mapper.UserMapper;
import org.zxl.model.User;
import org.zxl.utils.UUIDTool;

import java.util.Date;
import java.util.List;

/**
 * Created by zxl_lls@foxmail.com on 2018/2/28.
 */
@Service
public class UserService {
	@Autowired
	public UserMapper userMapper;

	public UserService() {
	}

	public List<User> getUserList() {
		return this.userMapper.getUserList();
	}

	public int insert(User user) {
		User userS = this.userMapper.selectByAccName(user.getAccName());
		if(userS == null) {
			user.setId(UUIDTool.getUUID());
			user.setCreateDate(new Date());
			user.setDelFlag("0");
			user.setUpdateDate(new Date());
			return this.userMapper.insert(user);
		} else {
			return 0;
//			user.setId(userS.getId());
//			user.setCreateDate(userS.getCreateDate());
//			user.setDelFlag("0");
//			user.setUpdateDate(new Date());
//			return this.userMapper.updateByPrimaryKey(user);
		}
	}
}
