package com.fly.dao.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDao<Entity, EntityExample, ID> {
    long countByExample(EntityExample example);

    int deleteByExample(EntityExample example);

    int deleteByPrimaryKey(ID id);

    int insert(Entity record);

    int insertSelective(Entity record);

    List<Entity> selectByExampleWithBLOBs(EntityExample example);

    List<Entity> selectByExample(EntityExample example);

    Entity selectByPrimaryKey(ID id);

    int updateByExampleSelective(@Param("record") Entity record, @Param("example") EntityExample example);

    int updateByExampleWithBLOBs(@Param("record") Entity record, @Param("example") EntityExample example);

    int updateByExample(@Param("record") Entity record, @Param("example") EntityExample example);

    int updateByPrimaryKeySelective(Entity record);

    int updateByPrimaryKeyWithBLOBs(Entity record);

    int updateByPrimaryKey(Entity record);
}
