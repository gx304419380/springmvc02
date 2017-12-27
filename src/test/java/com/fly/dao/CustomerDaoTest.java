package com.fly.dao;

import com.fly.domain.Customer;
import com.fly.domain.vo.CustomerQueryVo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CustomerDaoTest {

    @Test
    public void testCountByVo() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext-dao.xml"
        );
        CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
        CustomerQueryVo vo = new CustomerQueryVo();
        vo.setCustName("马");
        vo.setCustLevel("P");
//        vo.setCustSource("1");
//        vo.setCustIndustry("02");
        List<Customer> customers = customerDao.selectByQueryVo(vo);
        customers.forEach(customer -> System.out.println(customer));
    }

}