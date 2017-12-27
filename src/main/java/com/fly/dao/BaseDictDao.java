package com.fly.dao;

import com.fly.domain.BaseDict;
import com.fly.domain.BaseDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseDictDao {
    long countByExample(BaseDictExample example);

    int deleteByExample(BaseDictExample example);

    int deleteByPrimaryKey(String dictId);

    int insert(BaseDict record);

    int insertSelective(BaseDict record);

    List<BaseDict> selectByExample(BaseDictExample example);

    BaseDict selectByPrimaryKey(String dictId);

    int updateByExampleSelective(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

    int updateByExample(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

    int updateByPrimaryKeySelective(BaseDict record);

    int updateByPrimaryKey(BaseDict record);

    List<BaseDict> selectAll();

    List<BaseDict> selectByDictTypeCode(String dictTypeCode);
}