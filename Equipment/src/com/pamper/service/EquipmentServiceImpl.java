package com.pamper.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.pamper.entity.Equipment;
import com.pamper.mapper.EquipmentMapper;

@Service("equipmentService")
public class EquipmentServiceImpl implements EquipmentService {
	@Resource
	private EquipmentMapper equimentMapper;
	@Override
	public List<Equipment> queryList() {
		return equimentMapper.queryList();
	}

@Override
public int addEquipment(Equipment equipment) {
	return equimentMapper.addEquipment(equipment);
}



public static void main(String[] args) {
	System.out.println("sd");
	ApplicationContext a = new ClassPathXmlApplicationContext("appliactionContext.xml");
	EquipmentService e = (EquipmentService) a.getBean("equipmentService");	
    e.queryList();
}
}
