package com.fengzhiwei.house.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fengzhiwei.common.utils.DateUtils;
import com.fengzhiwei.common.utils.RandomUtils;

import com.fengzhiwei.common.utils.StringUtils;
import com.fengzhiwei.house.domain.House;
import com.fengzhiwei.house.service.HouseService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class HouseServiceImplTest {
	@Autowired
	private HouseService houseService;
	@Test
	public void testInsertBatch() {
		List<House> list = new ArrayList<House>();
		for (int i = 1; i <= 100; i++) {
			House h = new House();
			Calendar c = Calendar.getInstance();
			c.set(2020, 4, 1);
			h.setCreated(DateUtils.random(c.getTime(), new Date()));
			h.setName(StringUtils.generateChineseName());
			String str="";
			for (int j = 0; j < 11; j++) {
				str+=RandomUtils.random(0, 9);
			}
			h.setPhone(str);
			h.setTid(RandomUtils.random(1, 3));
			h.setContent(StringUtils.randomChineseString(RandomUtils.random(0, 15)));
			list.add(h);
		}
		houseService.insertBatch(list);
	}

}
