package cn.ainannan.huozhe.consume.bean;

import org.springframework.stereotype.Component;

import cn.ainannan.base.bean.BaseBean;

@Component
public class ConsumeOption extends BaseBean<ConsumeOption> {
	private String name;
	private String dateUnit;
	private String dateDefault;
	private String type;
	private String state;

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
}
