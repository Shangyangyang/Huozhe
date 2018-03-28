package cn.ainannan.sys.dict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.ainannan.sys.dict.bean.Dict;
import cn.ainannan.sys.dict.mapper.DictMapper;

@Service
public class DictService{
    @Autowired
    public DictMapper dictMapper;

    public  List<Dict> findList(Dict dict){
        return dictMapper.findList(dict);
    }

}
