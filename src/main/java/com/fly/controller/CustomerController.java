package com.fly.controller;

import com.fly.controller.base.BaseController;
import com.fly.domain.Customer;
import com.fly.domain.CustomerExample;
import com.fly.domain.vo.CustomerQueryVo;
import com.fly.service.CustomerService;
import com.fly.service.base.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController extends BaseController<Customer, CustomerExample, Long, CustomerQueryVo> {

    @Autowired
    private CustomerService customerService;

    @Override
    public BaseService<Customer, CustomerExample, Long> getBaseService() {
        return customerService;
    }

    /**
     * 条件查询
     * @param model
     * @param vo
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping
    public String list(Model model, CustomerQueryVo vo) throws UnsupportedEncodingException {

        if (vo != null) {
            if (vo.getCustName() != null && !"".equals(vo.getCustName()))
                vo.setCustName(new String(vo.getCustName().getBytes("iso8859-1"), "utf8"));
            if (vo.getPage() == null || vo.getPage() <= 0)
                vo.setPage(1);
        }
        customerService.list(model, vo);
        return "customer";
    }

    @Override
    protected CustomerExample getExample(CustomerQueryVo vo) {
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(vo.getCustName())) {
            criteria.andCustNameLike("%" + vo.getCustName() + "%");
        }
        if (StringUtils.isNotBlank(vo.getCustIndustry())) {
            criteria.andCustIndustryEqualTo(vo.getCustIndustry());
        }
        if (StringUtils.isNotBlank(vo.getCustLevel())) {
            criteria.andCustLevelEqualTo(vo.getCustLevel());
        }

        return example;
    }
}
