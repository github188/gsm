package org.zxl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zxl.model.User;
import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    User selectByAccName(String accName);

    List<User> getUserList();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}