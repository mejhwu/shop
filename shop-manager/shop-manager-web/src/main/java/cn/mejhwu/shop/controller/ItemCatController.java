package cn.mejhwu.shop.controller;

import cn.mejhwu.shop.pojo.ItemCat;
import cn.mejhwu.shop.service.ItemCatService;
import cn.mejhwu.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/16/17
 * Time:   8:46 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List listItemCat(@RequestParam(name = "id", defaultValue = "0") long parentId) {
        List<ItemCat> itemCats = itemCatService.listItemCatByParentId(parentId);

        List result = new ArrayList();

        for (ItemCat itemCat : itemCats) {
            Map map = new HashMap();
            map.put("id", itemCat.getId());
            map.put("text", itemCat.getName());
            map.put("state", itemCat.getIsParent() == 1 ? "closed" : "open");
            result.add(map);
        }
        return result;
    }

}
