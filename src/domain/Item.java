package domain;

import java.util.Date;

public class Item {
    private int id;

    private String remark;

    private int user_id;

    private int type_id;

    private String date;
    
    private String start_date;
    
    private String end_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getDate() {
        return date;
    }

	public void setDate(String date) {
        this.date = date;
    }
	
    public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", remark=" + remark + ", userId=" + user_id + ", typeId=" + type_id + ", date=" + date
				+ "]";
	}

}