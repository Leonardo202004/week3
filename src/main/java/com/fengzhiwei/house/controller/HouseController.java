package com.fengzhiwei.house.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fengzhiwei.house.domain.House;
import com.fengzhiwei.house.service.HouseService;
import com.fengzhiwei.house.vo.HouseVO;
import com.github.pagehelper.PageInfo;

@Controller
public class HouseController {
	@Autowired
	private HouseService houseService;
	@RequestMapping("houses")
	public String Houses(Model model,HouseVO vo,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "15")Integer pageSize) {
		PageInfo<House> info = houseService.houses(vo,pageNum,pageSize);
		model.addAttribute("info", info);
		model.addAttribute("vo", vo);
		return "houses";
	}
}
