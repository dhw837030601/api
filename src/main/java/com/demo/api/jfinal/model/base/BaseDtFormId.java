package com.demo.api.jfinal.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDtFormId<M extends BaseDtFormId<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setFormId(java.lang.String formId) {
		set("form_id", formId);
	}
	
	public java.lang.String getFormId() {
		return getStr("form_id");
	}

	public void setFailureTime(java.util.Date failureTime) {
		set("failure_time", failureTime);
	}
	
	public java.util.Date getFailureTime() {
		return get("failure_time");
	}

	public void setUsed(java.lang.Boolean used) {
		set("used", used);
	}
	
	public java.lang.Boolean getUsed() {
		return get("used");
	}

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

}