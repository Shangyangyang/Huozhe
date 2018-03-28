package cn.ainannan.sys.dict.mapper;


import java.util.List;

import org.springframework.stereotype.Repository;

import cn.ainannan.base.dao.CrudDao;
import cn.ainannan.sys.dict.bean.Dict;
@Repository
public interface DictMapper extends CrudDao<Dict>{
	List<Dict> findList(Dict dict);
}