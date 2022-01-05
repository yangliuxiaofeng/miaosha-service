package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.UserDO;
import com.miaoshaproject.dataobject.UserPasswordDO;

public interface UserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Tue Dec 21 18:38:54 CST 2021
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Tue Dec 21 18:38:54 CST 2021
     */
    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Integer id);

    UserDO selectByTelphone(String telphone);
}