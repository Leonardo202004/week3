package com.fengzhiwei.house.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fengzhiwei.house.dao.HouseDao;
import com.fengzhiwei.house.domain.House;
import com.fengzhiwei.house.service.HouseService;
import com.fengzhiwei.house.vo.HouseVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional
public class HouseServiceImpl implements HouseService {
	@Autowired
	private HouseDao houseDao;
	@Override
	public int insertBatch(List<House> list) {
		// TODO Auto-generated method stub
		return houseDao.insertBatch(list);
	}
	@Override
	public int insert(House house) {
		// TODO Auto-generated method stub
		return houseDao.insert(house);
	}
	@Override
	public PageInfo<House> houses(HouseVO vo, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<House> list = houseDao.houses(vo);
		return new PageInfo<>(list);
	}

}
