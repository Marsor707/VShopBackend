package com.github.marsor707.controller;

import com.github.marsor707.pojo.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
@RestController
public class ShopController {

    @GetMapping(value = "/getNewsList")
    public List<News> getNewsList() {
        List<News> list = new ArrayList<>();
        News news1 = new News(1, "新闻条目1新闻条目1新闻条目1新闻条目1", "http://starcraft.com");
        News news2 = new News(2, "新闻条目2新闻条目2新闻条目2新闻条目2", "http://warcraft.com");
        News news3 = new News(3, "新闻条3新闻条3新闻条3", "http://overwatch.com");
        News news4 = new News(4, "新闻条4广告发布", "http://hearstone.com");
        list.add(news1);
        list.add(news2);
        list.add(news3);
        list.add(news4);
        return list;
    }

    @GetMapping(value = "/login")
    public LoginUser userLogin() {
        return new LoginUser("marsor707", 123456);
    }

    @PostMapping(value = "/getPrice")
    public Amount getPrice(@RequestBody Object o) {
        return new Amount(648);
    }

    @PostMapping(value = "/createOrder")
    public CreateOrder createOrder(@RequestBody Object o) {
        System.out.println(o.toString());
        return new CreateOrder("6djk979");
    }

    @PostMapping(value = "/checkOrder")
    public void checkOrder() {

    }

    @PostMapping(value = "/getOrderList")
    public OrderList getOrderList(@RequestBody Object o) {
        Order order1 = new Order("ddj123", "数据统计", "高级版", "1年", 2, "2016-10-10", "500元");
        Order order2 = new Order("yuj583", "流量分析", "户外版", "3个月", 1, "2016-5-2", "2200元");
        Order order3 = new Order("pmd201", "广告发布", "商铺版", "3年", 12, "2016-8-3", "7890元");
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        return new OrderList(orders);
    }

}
