package com.fengzhiwei.house.service;

import java.util.List;

import com.fengzhiwei.house.domain.House;
import com.fengzhiwei.house.vo.HouseVO;
import com.github.pagehelper.PageInfo;

public interface HouseService {
	int insertBatch(List<House> list);
	int insert(House house);
	PageInfo<House> houses(HouseVO vo, Integer pageNum, Integer pageSize);
}
