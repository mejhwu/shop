package cn.mejhwu.shop.service;

import cn.mejhwu.shop.pojo.ItemCat;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/16/17
 * Time:   8:43 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

public interface ItemCatService {

    List<ItemCat> listItemCatByParentId(long parentId);

}
