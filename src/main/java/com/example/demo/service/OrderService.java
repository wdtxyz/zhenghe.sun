package com.example.demo.service;

import com.example.demo.Entity.Order;
import com.example.demo.Mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public int insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }
    public List<Order> ListOrder(int start,int end){
        List<Order> orderList = new ArrayList<Order>();
        try{
            Map<String,Object> param = new LinkedHashMap<String,Object>();
            param.put("start",start);
            param.put("end",end);

            orderList=orderMapper.ListOrder(param);

        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }finally{
            return orderList;
        }
    }
    public int Update(Order order){
        return orderMapper.Update(order);
    }
    public int delete(int id){
        return orderMapper.delete(id);
    }
}
