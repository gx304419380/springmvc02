package com.fly.service.base;

import java.util.List;

public interface BaseService<Entity, EntityExample, ID> {
    long countByExample(EntityExample example);

    int deleteByExample(EntityExample example);

    int deleteByPrimaryKey(ID id);

    int insert(Entity entity);

    int insertSelective(Entity entity);

    List<Entity> selectByExampleWithBLOBs(EntityExample example);

    List<Entity> selectByExample(EntityExample example);

    Entity selectByPrimaryKey(ID id);

    int updateByExampleSelective(Entity entity, EntityExample example);

    int updateByExampleWithBLOBs(Entity entity, EntityExample example);

    int updateByExample(Entity entity, EntityExample example);

    int updateByPrimaryKeySelective(Entity entity);

    int updateByPrimaryKeyWithBLOBs(Entity entity);

    int updateByPrimaryKey(Entity entity);
}
