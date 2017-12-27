package com.fly.service;

import com.fly.domain.Customer;
import com.fly.domain.CustomerExample;
import com.fly.domain.vo.CustomerQueryVo;
import com.fly.service.base.BaseService;
import org.springframework.ui.Model;

public interface CustomerService extends BaseService<Customer, CustomerExample, Long> {

    void list(Model model, CustomerQueryVo vo);
}
