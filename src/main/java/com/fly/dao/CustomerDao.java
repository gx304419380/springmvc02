package com.fly.dao;

import com.fly.dao.base.BaseDao;
import com.fly.domain.Customer;
import com.fly.domain.CustomerExample;
import java.util.List;
import com.fly.domain.vo.CustomerQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends BaseDao<Customer, CustomerExample, Long> {
    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Long custId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    List<Customer> selectByQueryVo(CustomerQueryVo vo);

    Customer selectByPrimaryKey(Long custId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    int countByQueryVo(CustomerQueryVo vo);
}