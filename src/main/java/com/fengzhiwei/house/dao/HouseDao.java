package com.fengzhiwei.house.dao;

import java.util.List;

import com.fengzhiwei.house.domain.House;
import com.fengzhiwei.house.vo.HouseVO;

public interface HouseDao {

	int insertBatch(List<House> list);
	int insert(House house);
	List<House> houses(HouseVO vo);
}
