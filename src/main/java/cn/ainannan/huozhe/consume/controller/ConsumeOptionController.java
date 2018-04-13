package cn.ainannan.huozhe.consume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.ainannan.base.result.ResultGen;
import cn.ainannan.base.result.ResultObject;
import cn.ainannan.huozhe.consume.bean.ConsumeOption;
import cn.ainannan.huozhe.consume.service.ConsumeOptionService;
import cn.ainannan.sys.dict.bean.Dict;
import cn.ainannan.sys.dict.service.DictService;

@RestController
@RequestMapping(value="/consume/option")
public class ConsumeOptionController {
	@Autowired
	private ConsumeOptionService optionService;
	@Autowired
	private DictService dictService;
	
	@RequestMapping("list")
	public ResultObject list(ConsumeOption option){
		List<ConsumeOption> list = optionService.findList(option);
		return ResultGen.genSuccessResult(list);
	}
	
	@RequestMapping("preUpdate")
	public ResultObject preUpdate(ConsumeOption option){

		ConsumeOption co = optionService.get(option);
		
		co.setDateDefaultList(dictService.findList(new Dict("consume_time_unit")));
		for (int i = 0, size = co.getDateDefaultList().size(); i < size; i++) {
			Dict d = co.getDateDefaultList().get(i);
			if(d.getValue().equals(co.getDateDefault())) {
				d.setChecked(true);
			}else {
				d.setChecked(false);
			}
		}
		
		co.setTypeList(dictService.findList(new Dict("consume_option_type")));
		for (int i = 0, size = co.getTypeList().size(); i < size; i++) {
			Dict d = co.getTypeList().get(i);
			if(d.getValue().equals(co.getType())) {
				d.setChecked(true);
			}else {
				d.setChecked(false);
			}
		}
		return ResultGen.genSuccessResult(co);
	}
	
	@RequestMapping("save")
	public ResultObject save(ConsumeOption consumeOption){
		optionService.save(consumeOption);
		return ResultGen.genSuccessResult();
	}
	
	@RequestMapping("delete")
	public ResultObject delete(ConsumeOption consumeOption){
		optionService.delete(consumeOption);
		return ResultGen.genSuccessResult();
	}
}
