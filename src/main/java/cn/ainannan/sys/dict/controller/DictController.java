package cn.ainannan.sys.dict.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.ainannan.base.result.ResultGen;
import cn.ainannan.base.result.ResultObject;
import cn.ainannan.sys.dict.bean.Dict;
import cn.ainannan.sys.dict.service.DictService;

@RestController
@RequestMapping("dict")
public class DictController {
	@Autowired
	private DictService dictService;

	@RequestMapping(value="list")
    public ResultObject list(Dict dict){
        List<Dict> list = dictService.findList(dict); 
        return ResultGen.genSuccessResult(list);
    }
	
	@RequestMapping(value="lists")
	public ResultObject lists(String name, String id){
		String [] names = name.split(",");
		List<List<Dict>> dictList = new ArrayList<List<Dict>>();
		
		for (int i = 0; i < names.length; i++) {
			Dict dict = new Dict();
			dict.setName(names[i]);
			List<Dict> list = dictService.findList(dict); 
			dictList.add(list);
		}
		
		return ResultGen.genSuccessResult(dictList);
	}
	
	@RequestMapping(value="add")
	public Boolean add(Dict dict){
		dictService.save(dict);
		return true;
	}
	
	/**
	 * 通过名称、值来获取字典表的标签
	 * @param dict
	 * @return
	 */
	@RequestMapping(value="getLabelByName")
	public String getLabelByName(Dict dict){
		return dictService.getLabelByName(dict);
	}
}
