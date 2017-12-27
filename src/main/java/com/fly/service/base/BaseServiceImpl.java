package com.fly.service.base;

import com.fly.dao.base.BaseDao;

import java.util.List;

public abstract class BaseServiceImpl<Entity, EntityExample, ID> implements BaseService<Entity, EntityExample, ID> {

    public abstract BaseDao<Entity, EntityExample, ID> getBaseDao();

    @Override
    public long countByExample(EntityExample entityExample) {
        return getBaseDao().countByExample(entityExample);
    }

    @Override
    public int deleteByExample(EntityExample entityExample) {
        return getBaseDao().deleteByExample(entityExample);
    }

    @Override
    public int deleteByPrimaryKey(ID id) {
        return getBaseDao().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Entity entity) {
        return getBaseDao().insert(entity);
    }

    @Override
    public int insertSelective(Entity entity) {
        return getBaseDao().insertSelective(entity);
    }

    @Override
    public List<Entity> selectByExampleWithBLOBs(EntityExample entityExample) {
        return getBaseDao().selectByExampleWithBLOBs(entityExample);
    }

    @Override
    public List<Entity> selectByExample(EntityExample entityExample) {
        return getBaseDao().selectByExample(entityExample);
    }

    @Override
    public Entity selectByPrimaryKey(ID id) {
        return getBaseDao().selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Entity entity, EntityExample entityExample) {
        return getBaseDao().updateByExampleSelective(entity, entityExample);
    }

    @Override
    public int updateByExampleWithBLOBs(Entity entity, EntityExample entityExample) {
        return getBaseDao().updateByExampleWithBLOBs(entity, entityExample);
    }

    @Override
    public int updateByExample(Entity entity, EntityExample entityExample) {
        return getBaseDao().updateByExample(entity, entityExample);
    }

    @Override
    public int updateByPrimaryKeySelective(Entity entity) {
        return getBaseDao().updateByPrimaryKeySelective(entity);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Entity entity) {
        return getBaseDao().updateByPrimaryKeyWithBLOBs(entity);
    }

    @Override
    public int updateByPrimaryKey(Entity entity) {
        return getBaseDao().updateByPrimaryKey(entity);
    }
}
