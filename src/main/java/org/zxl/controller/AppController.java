package org.zxl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.zxl.model.SysPara;
import org.zxl.utils.MVUtil;
import org.zxl.utils.Path;

/**
 * Created by zxl_lls@foxmail.com on 2018/2/27.
 */
@RestController
public class AppController {
	@RequestMapping("/index")
	public ModelAndView index(MVUtil mvu){
		ModelAndView mv = mvu.getMV();
		mv.setViewName("system/main_html/main");
		return mv;
	}
}
