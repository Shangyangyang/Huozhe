package cn.ainannan.sys.dict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.ainannan.sys.dict.bean.Dict;
import cn.ainannan.sys.dict.service.DictService;

@RestController
@RequestMapping("/dict")
public class DictController {
	@Autowired
	private DictService dictService;

	@RequestMapping(value="/list")
    public List<Dict> list(){
        List<Dict> list = dictService.findList(new Dict()); 
        return list;
    }
}
