package com.chinact.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinact.bean.UserObj;

/**
 * 
 * 用户mapper接口层
 * 
 * @ClassName: UserMapper
 * @Description: TODO
 * @author Gaokui
 * @date 2023-09-18 10:33:31
 */
@Mapper
public interface UserMapper extends BaseMapper<UserObj> {
	
}
