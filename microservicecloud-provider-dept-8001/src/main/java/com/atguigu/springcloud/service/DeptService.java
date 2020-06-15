package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @author frnakman
 * @create 2020-06-15 9:59
 */
public interface DeptService {

//  public boolean add(Dept dept);
//  public Dept  get(Long id);
//  public List<Dept> list();
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();

}
