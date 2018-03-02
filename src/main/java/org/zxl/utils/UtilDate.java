package org.zxl.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zxl_lls@foxmail.com on 2018/2/28.
 */
public class UtilDate {
	public String getDateNow(){
		Date date = new Date();
		return fomatDate(date);
	}

	/*
	* 格式化日期("yyyy-MM-dd hh:mm:ss ");
	*
	* */
	public String fomatDate(Date date){
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
		return ft.format(date);
	}
}
