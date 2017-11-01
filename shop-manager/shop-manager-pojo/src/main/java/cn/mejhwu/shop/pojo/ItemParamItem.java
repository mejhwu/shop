package cn.mejhwu.shop.pojo;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/12/17
 * Time:   10:00 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

public class ItemParamItem {
    private long id;
    private long itemId;
    private String paramData;
    private Date created;
    private Date updated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
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
        return "ItemParamItem{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", paramData='" + paramData + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
