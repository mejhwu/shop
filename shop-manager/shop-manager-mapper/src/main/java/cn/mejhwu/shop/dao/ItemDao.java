package cn.mejhwu.shop.dao;

import cn.mejhwu.shop.pojo.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/15/17
 * Time:   2:21 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

@Mapper
public interface ItemDao {

    String TABLE_NAME = " `tb_item` ";

    String SELECT_FILED = " `id`, `title`, `sell_point`, `price`, `num`, " +
            "`barcode`, `image`, `cid`, `status`, `created`, `updated` ";


    @Select({" SELECT ", SELECT_FILED, " FROM ",
            TABLE_NAME, " LIMIT #{offset}, #{limit}"})
    List<Item> listItem(@Param("offset") long offset,
                        @Param("limit") long limit);

    @Select({" SELECT ", SELECT_FILED, " FROM ", TABLE_NAME,
            " WHERE `id`=#{id}"})
    Item getItemById(long id);
}
