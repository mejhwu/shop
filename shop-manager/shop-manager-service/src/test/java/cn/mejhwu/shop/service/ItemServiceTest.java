package cn.mejhwu.shop.service;

import cn.mejhwu.shop.pojo.Item;
import cn.mejhwu.shop.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/15/17
 * Time:   8:47 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
public class ItemServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(ItemServiceTest.class);

    @Autowired
    ItemService itemService;

    @Test
    public void testGetItemById() {
        Item item  = itemService.getItemById(860275);
        logger.info(item.toString());
    }

}
