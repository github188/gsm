package org.zxl.utils;

import java.util.UUID;

/**
 * Created by zxl_lls@foxmail.com on 2018/2/28.
 */
public class UUIDTool {
    /**
     * 自动生成32位的UUid，对应数据库的主键id进行插入用。
     * @return
     */
    public static String getUUID(){

        return UUID.randomUUID().toString().replace("-", "");
   }

}
