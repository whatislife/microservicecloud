package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author frnakman
 * @create 2020-06-15 10:04
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value="/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept ){
        return deptService.add(dept);
    }
    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }
    @RequestMapping(value="/dept/list" , method = RequestMethod.POST)
    public List<Dept> list(){
        return deptService.list();
    }
    @PostMapping(value="/dept/listAll")
    public List<Dept> listAll(){
        return deptService.list();
    }

}
