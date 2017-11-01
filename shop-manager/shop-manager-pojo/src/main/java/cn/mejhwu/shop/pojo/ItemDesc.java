package cn.mejhwu.shop.pojo;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/12/17
 * Time:   9:57 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

public class ItemDesc {
    private long itemId;
    private String itemDesc;
    private Date created;
    private Date updated;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "ItemDesc{" +
                "itemId=" + itemId +
                ", itemDesc='" + itemDesc + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
