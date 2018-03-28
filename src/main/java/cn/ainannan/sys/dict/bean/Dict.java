package cn.ainannan.sys.dict.bean;

import org.springframework.stereotype.Component;

import cn.ainannan.base.bean.BaseBean;

@Component
public class Dict extends BaseBean<Dict> {
	private String label;
	private String value;
	private String name;
	private Integer sort;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

}
