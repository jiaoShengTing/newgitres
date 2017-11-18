package com.pamper.service;

import java.util.List;

import com.pamper.entity.Equipment;

public interface EquipmentService {
	public List<Equipment> queryList();
	public int addEquipment(Equipment equipment);

}
