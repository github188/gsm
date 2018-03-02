package org.zxl.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by zxl_lls@foxmail.com on 2018/3/1.
 */
public class PropertiesUtil {
	public static String getValue(String key){
		Properties prop = new Properties();
		try {
			//装载配置文件
			InputStream inStream = PropertiesUtil.class.getClassLoader().getResourceAsStream("application.properties");

			prop.load(inStream);

		} catch (IOException e) {
			e.printStackTrace();
		}
		//返回获取的值
		return prop.getProperty(key);
	}
	/*public static void main(String[] args) {
		System.out.println(getValue("dbUser"));
	}*/
}
