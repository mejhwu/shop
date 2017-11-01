package cn.mejhwu.shop.service.impl;

import cn.mejhwu.shop.dao.ItemCatDao;
import cn.mejhwu.shop.pojo.ItemCat;
import cn.mejhwu.shop.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/16/17
 * Time:   8:44 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    ItemCatDao itemCatDao;

    @Override
    public List<ItemCat> listItemCatByParentId(long parentId) {
        return itemCatDao.listItemCatByParentId(parentId);
    }
}
