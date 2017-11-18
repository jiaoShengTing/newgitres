package com.pamper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pamper.entity.Equipment;
import com.pamper.mapper.EquipmentMapper;

@Controller
public class EquipmentController{
  
	@Autowired
	private EquipmentMapper equipmentService;
	@RequestMapping("/queryList.mapper")
	public ModelAndView queryList() throws Exception{
		List<Equipment> list = equipmentService.queryList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("index.jsp");
		return modelAndView;
		
	}
	
	
	@RequestMapping("/addEqu.mapper")
	public ModelAndView addEqu(Equipment equipment) throws Exception{
		equipmentService.addEquipment(equipment);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("queryList.mapper");
		return modelAndView;
		
	}
	
	@RequestMapping("/addEqu1.mapper")
	public String Demo(Model model,Equipment equipment) throws Exception{
		equipmentService.addEquipment(equipment);
		return "queryList.mapper";
		
	}
	
	@RequestMapping("/queryById.mapper")
	public String queryById(Model model,int id) throws Exception{
	Equipment equipment=equipmentService.queryById(id);
	model.addAttribute("equipment", equipment);
    return "updateEqu.jsp";
		
	}
	@RequestMapping("/updateEqu.mapper")
	public String updateEqu(Model model,Equipment equipment) throws Exception{
		equipmentService.updateEqu(equipment);
		return "queryList.mapper";
		
	}
	
}
