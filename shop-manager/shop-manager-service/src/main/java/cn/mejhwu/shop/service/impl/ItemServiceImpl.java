package cn.mejhwu.shop.service.impl;

import cn.mejhwu.shop.dao.ItemDao;
import cn.mejhwu.shop.pojo.Item;
import cn.mejhwu.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/15/17
 * Time:   4:59 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemDao itemDao;

    @Override
    public Item getItemById(long id) {
        return itemDao.getItemById(id);
    }
}
