package org.zxl.utils;

import org.springframework.web.servlet.ModelAndView;
import org.zxl.model.SysPara;

/**
 * Created by zxl_lls@foxmail.com on 2018/3/1.
 */
public class MVUtil {
	public ModelAndView getMV(){
		ModelAndView mv = new ModelAndView();
		SysPara sysPara = new SysPara();
		mv.addObject(sysPara);
		return mv;
	}
}
