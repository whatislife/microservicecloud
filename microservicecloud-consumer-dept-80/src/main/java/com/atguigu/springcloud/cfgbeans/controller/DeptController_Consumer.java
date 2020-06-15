package com.atguigu.springcloud.cfgbeans.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author frnakman
 * @create 2020-06-15 11:43
 */
@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(@RequestBody Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept, Boolean.class);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list() {
         return restTemplate.postForObject(REST_URL_PREFIX+"/dept/list",null, List.class);
    }


    //测试@EnableDiscoveryClient,消费端可以调用服务发现
    //@RequestMapping(value="/consumer/dept/discovery") 
    @RequestMapping(value="/consumer/dept/discover")
    public Object discovery(){
      return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
    }

}
