package cn.mejhwu.shop.pojo;

import org.joda.time.DateTime;

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
    private DateTime created;
    private DateTime updated;

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

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public DateTime getUpdated() {
        return updated;
    }

    public void setUpdated(DateTime updated) {
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
