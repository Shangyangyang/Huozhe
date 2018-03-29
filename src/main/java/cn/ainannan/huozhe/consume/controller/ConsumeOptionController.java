package cn.ainannan.huozhe.consume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.ainannan.huozhe.consume.bean.ConsumeOption;
import cn.ainannan.huozhe.consume.service.ConsumeOptionService;

@RestController
@RequestMapping(value="/consume/option")
public class ConsumeOptionController {
	@Autowired
	private ConsumeOptionService optionService;
	
	@RequestMapping("list")
	public List<ConsumeOption> list(ConsumeOption option){
		List<ConsumeOption> list = optionService.findList(option);
		return list;
	}
	
	@RequestMapping("preUpdate")
	public ConsumeOption preUpdate(ConsumeOption option){
		System.out.println("option.getId():" + option.getId());
		ConsumeOption co = optionService.get(option);
		return co;
	}
	
	@RequestMapping("save")
	public Boolean save(ConsumeOption consumeOption){
		optionService.save(consumeOption);
		return true;
	}
}
