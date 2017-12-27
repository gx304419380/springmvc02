package com.fly.service.impl;

import cn.itcast.utils.Page;
import com.fly.dao.BaseDictDao;
import com.fly.dao.CustomerDao;
import com.fly.dao.base.BaseDao;
import com.fly.domain.BaseDict;
import com.fly.domain.Customer;
import com.fly.domain.CustomerExample;
import com.fly.domain.vo.CustomerQueryVo;
import com.fly.service.CustomerService;
import com.fly.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, CustomerExample, Long> implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private BaseDictDao baseDictDao;
    @Override
    public BaseDao<Customer, CustomerExample, Long> getBaseDao() {
        return customerDao;
    }

    @Override
    public void list(Model model, CustomerQueryVo vo) {
        List<BaseDict> fromType =  baseDictDao.selectByDictTypeCode("002");
        List<BaseDict> industryType =  baseDictDao.selectByDictTypeCode("001");
        List<BaseDict> levelType =  baseDictDao.selectByDictTypeCode("006");

        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);

        Page<Customer> page = new Page<>();
        page.setPage(vo.getPage());
        page.setSize(vo.getSize());

        int count = customerDao.countByQueryVo(vo);
        List<Customer> customers = customerDao.selectByQueryVo(vo);
        page.setTotal(count);
        page.setRows(customers);

        model.addAttribute("page", page);
    }
}
