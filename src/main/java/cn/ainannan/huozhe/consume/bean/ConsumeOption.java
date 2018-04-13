package cn.ainannan.huozhe.consume.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.ainannan.base.bean.BaseBean;
import cn.ainannan.sys.dict.bean.Dict;

@Component
public class ConsumeOption extends BaseBean<ConsumeOption> {
	private String name;
	private String dateUnit;
	private String dateDefault;
	private String type;
	private String state;
	
	private List<Dict> dateDefaultList;
	private List<Dict> typeList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateUnit() {
		return dateUnit;
	}

	public void setDateUnit(String dateUnit) {
		this.dateUnit = dateUnit;
	}

	public String getDateDefault() {
		return dateDefault;
	}

	public void setDateDefault(String dateDefault) {
		this.dateDefault = dateDefault;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Dict> getDateDefaultList() {
		return dateDefaultList;
	}

	public void setDateDefaultList(List<Dict> dateDefaultList) {
		this.dateDefaultList = dateDefaultList;
	}

	public List<Dict> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<Dict> typeList) {
		this.typeList = typeList;
	}
}
