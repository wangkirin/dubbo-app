package com.wangsong.system.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangsong.common.controller.BaseController;
import com.wangsong.system.model.Dict;
import com.wangsong.system.model.DictPage;
import com.wangsong.system.service.DictService;

@Controller
@RequestMapping("/system/dict")
public class DictController extends BaseController{
	@Autowired
	private DictService dictService;
	
	@RequiresPermissions("/system/dict/list")
	@RequestMapping(value="/list")
	@ResponseBody
	public Object list(DictPage dict) {
		return dictService.findTByPage(dict);
	}

	@RequiresPermissions("/system/dict/add")
	@RequestMapping(value="/add")
	@ResponseBody
	public Object add(Dict dict) {
		return dictService.insertDict(dict);
	}
	
	@RequiresPermissions("/system/dict/update")
	@RequestMapping(value="/update")
	@ResponseBody
	public Object update(Dict dict) {
		return dictService.updateByPrimaryKeyDict(dict);
	}
	
	@RequiresPermissions("/system/dict/delete")
	@RequestMapping(value="/delete")
	@ResponseBody
	public Object delete(String[] id) {
		return dictService.deleteByPrimaryKeyDict(id);
	}
	
	@RequestMapping(value="/findDictByDict")
	@ResponseBody
	public Object findDictByDict(Dict dict) {
		return dictService.findTByT(dict);
	}
	
	@RequestMapping(value="/selectByPrimaryKey")
	@ResponseBody
	public Object selectByPrimaryKey(String id) {
		return dictService.selectByPrimaryKey(id);
	}
	
}
