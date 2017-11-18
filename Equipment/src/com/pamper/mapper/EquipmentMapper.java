package com.pamper.mapper;

import java.util.List;
import com.pamper.entity.Equipment;
public interface EquipmentMapper {
	public List<Equipment> queryList();
	
	public int addEquipment(Equipment equipment);
	
	public Equipment queryById(int id);
	public int updateEqu(Equipment equipment);

}
