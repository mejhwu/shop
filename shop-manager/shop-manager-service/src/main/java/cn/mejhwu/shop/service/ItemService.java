package cn.mejhwu.shop.service;

import cn.mejhwu.shop.dto.ShopResult;
import cn.mejhwu.shop.pojo.Item;

import java.util.List;

/**
 * Created by mejhwu on 7/15/17.
 */

public interface ItemService {

    Item getItemById(long id);

    List<Item> listItem(long offset, long limit);

    long countItem();

    ShopResult saveItem(Item item);
}
