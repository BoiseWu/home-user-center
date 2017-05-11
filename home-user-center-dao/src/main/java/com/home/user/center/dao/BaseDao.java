/*
 * Copyright (c) 2014 www.jd.com All rights reserved.
 * 本软件源代码版权归京东成都云平台所有,未经许可不得任意复制与传播.
 */
package com.home.user.center.dao;

import java.io.Serializable;
import java.util.List;

/**
 * dao基类<实体,主键>
 * @author J-ONE
 * @since 2014-03-18
 * @param <T> 实体
 * @param <ID> 主键
 */
public interface BaseDao<T,ID extends Serializable> {

	/**
	 * 添加对象
	 * @param t
	 * @return 影响条数
	 */
	int insert(T t);
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	int insertBatch(List<T> t);
	
	/**
	 * 删除对象,条件
	 * @param id
	 * @return 影响条数
	 */
	int deleteById(ID id);
	
	/**
	 * 根据条件删除对象
	 * @param t
	 * @return
	 */
	int deleteByCondition(T t);
	
	/**
	 * 更新对象,条件主键ID
	 * @param t
	 * @return 影响条数
	 */
	int updateById(T t);

	/**
	 * 查询对象,条件主键
	 * @param id
	 * @return
	 */
	T selectById(ID id);
	
	/**
	 * 查询对象,只要不为NULL与空则为条件
	 * @param t
	 * @return
	 */
	List<T> selectList(T t);
	
	/**
	 * @param t
	 * @return
	 */
	public T selectOne(T t);
	
	/**
	 * 查询对象总数
	 * @param t
	 * @return
	 */
	Long selectCount(T t);
}
