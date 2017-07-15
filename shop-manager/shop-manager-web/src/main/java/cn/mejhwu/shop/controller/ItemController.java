package cn.mejhwu.shop.controller;

import cn.mejhwu.shop.pojo.Item;
import cn.mejhwu.shop.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/15/17
 * Time:   5:01 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

@Controller
public class ItemController {

    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    ItemService itemService;

    @RequestMapping("/item/{id}")
    @ResponseBody
    public Item item(@PathVariable("id") long id) {
        System.out.println("jjjjjjjjjjjjjjjj");
        Item item = itemService.getItemById(id);
        int a = 1;
        int b = 2;
        return item;
    }

}
