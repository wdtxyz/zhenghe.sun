package com.example.demo.Mapper;


import com.example.demo.Entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {
    public List<Order> ListOrder(Map<String,Object> param);
    public int insertOrder(Order order);
    public int delete(int id);
    public int Update(Order order);

}
