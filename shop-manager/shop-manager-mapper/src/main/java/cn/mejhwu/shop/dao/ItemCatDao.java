package cn.mejhwu.shop.dao;

import cn.mejhwu.shop.pojo.ItemCat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/16/17
 * Time:   6:27 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

@Mapper
public interface ItemCatDao {

    String TABLE_NAME = " `tb_item_cat` ";

    String SELECT_FIELD = " `id`, `parent_id`, `name`, `status`, " +
            "`sort_order`, `is_parent` ";

    @Select({"SELECT ", SELECT_FIELD, " FROM ", TABLE_NAME,
            " WHERE `parent_id`=#{parentId}"})
    List<ItemCat> listItemCatByParentId(long parentId);

}
