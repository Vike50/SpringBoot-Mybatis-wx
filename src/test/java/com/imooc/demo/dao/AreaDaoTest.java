package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ClassName: AreaDaoTest
 * Description:
 * date: 2019/10/29 11:27
 *
 * @author Wusihao
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class AreaDaoTest {

	@Autowired
	private AreaDao areaDao;
	@Test
	void queryArea() {
		List<Area> areaList = areaDao.queryArea();
		System.out.println(areaList.size());
	}

	@Test
	void queryAreaById() {
	}

	@Test
	void insertArea() {
	}

	@Test
	void updateArea() {
	}

	@Test
	void deleteArea() {
	}
}