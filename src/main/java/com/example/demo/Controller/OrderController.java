package com.example.demo.Controller;

import com.example.demo.Entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/OrderController", method = { RequestMethod.GET, RequestMethod.POST })
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/ListUserOrder")
    @ResponseBody
    public List<Order> ListUser(int start,int end){

        return orderService.ListOrder(start,end);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = orderService.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
  @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Order order) {
        int result = orderService.Update(order);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
@RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insert(Order order)
    {
        return orderService.insertOrder(order);
    }
}
