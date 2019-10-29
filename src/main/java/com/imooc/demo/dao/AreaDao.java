package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName: AreaDao
 * Description:
 * date: 2019/10/25 16:13
 *
 * @author Wusihao
 */
public interface AreaDao {
	List<Area> queryArea();
	Area queryAreaById(int id);
	int insertArea(Area area);
	int updateArea(Area area);
	int DeleteArea(int id);
}
