package cn.mejhwu.shop.service.impl;

import cn.mejhwu.shop.dao.ItemDao;
import cn.mejhwu.shop.dto.ShopResult;
import cn.mejhwu.shop.pojo.Item;
import cn.mejhwu.shop.service.ItemService;
import cn.mejhwu.shop.util.IDUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Override
    public List<Item> listItem(long offset, long limit) {
        return itemDao.listItem(offset, limit);
    }

    @Override
    public long countItem() {
        return itemDao.countItem();
    }

    @Override
    public ShopResult saveItem(Item item) {
        item.setId(IDUtils.genItemId());
        item.setStatus(1);
        item.setUpdated(new Date());
        item.setCreated(new Date());

        int res = itemDao.saveItem(item);

        if (res != 0) {
            return ShopResult.ok();
        }
        return null;
    }
}
