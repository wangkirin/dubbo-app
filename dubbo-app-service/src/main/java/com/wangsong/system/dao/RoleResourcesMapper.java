package com.wangsong.system.dao;

import java.util.List;

import com.wangsong.system.model.Resources;
import com.wangsong.system.model.Role;
import com.wangsong.system.model.RoleResources;

public interface RoleResourcesMapper {
	int deleteByPrimaryKey(String id);

    int insert(RoleResources record);

    RoleResources selectByPrimaryKey(String id);

    List<RoleResources> selectAll();

    int updateByPrimaryKey(RoleResources record);
    
	List<Resources> findResourcesByT(Resources resources);

	void deleteByT(RoleResources[] roleResources);

	List<RoleResources> findTByT(RoleResources roleResources);
		
}