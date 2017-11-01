package cn.mejhwu.shop.controller;

import cn.mejhwu.shop.dto.EasyUIResult;
import cn.mejhwu.shop.dto.ShopResult;
import cn.mejhwu.shop.pojo.Item;
import cn.mejhwu.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/16/17
 * Time:   5:57 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping("/list")
    @ResponseBody
    public EasyUIResult listItem(int page, int rows) {
        long total = itemService.countItem();
        List<Item> items = itemService.listItem(page * rows, rows);
        EasyUIResult result = new EasyUIResult(total, items);
        return result;
    }

    @RequestMapping("/save")
    @ResponseBody
    public ShopResult saveItem(Item item) {
        return itemService.saveItem(item);
    }

}
