package org.zxl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.zxl.model.User;
import org.zxl.service.UserService;
import org.zxl.utils.MVUtil;
import org.zxl.utils.StatusTool;

import java.util.List;

/**
 * Created by zxl_lls@foxmail.com on 2018/2/27.
 */
@RestController
@CrossOrigin
@RequestMapping("/empManage")
public class UserController {
	@Autowired
	public UserService userService;
	@RequestMapping("")
	public ModelAndView user(MVUtil mvu){
		ModelAndView mv = mvu.getMV();
		mv.setViewName("system/main_html/empManage");
		List<User> userList = userService.getUserList();
		mv.addObject(userList);
		return mv;
	}
	@RequestMapping("/add")
	public ModelAndView addPage(MVUtil mvu){
		ModelAndView mv = mvu.getMV();
		mv.setViewName("system/views/user/userAdd");

		return mv;
	}
	@RequestMapping("/save")
	public StatusTool saveUser(User user){
		int status = userService.insert(user);

		return new StatusTool().getStatusObj("200",user);
	}
}
