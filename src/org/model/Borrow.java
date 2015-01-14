package org.model;

import java.util.Date;

/**
 * Borrow entity. @author MyEclipse Persistence Tools
 */

public class Borrow implements java.io.Serializable {

	// Fields

	private Integer brwid;
	//private Integer bid;
	//private Integer uid;
	private Date brwDate;
	private Date needDate;
	private Date rtnDate;
	private Boolean hasRtn;
	private User1 user;
	private Book book;

	// Constructors

	/** default constructor */
	public Borrow() {
	}

	/** full constructor */
	public Borrow(Date brwDate, Date needDate,
			Date rtnDate, Boolean hasRtn,User1 user,Book book) {
		//this.bid = bid;
		//this.uid = uid;
		this.brwDate = brwDate;
		this.needDate = needDate;
		this.rtnDate = rtnDate;
		this.hasRtn = hasRtn;
		this.user=user;
		this.book=book;
	}

	// Property accessors

	public Integer getBrwid() {
		return this.brwid;
	}

	public void setBrwid(Integer brwid) {
		this.brwid = brwid;
	}
/*
	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}
*/
	public Date getBrwDate() {
		return this.brwDate;
	}

	public void setBrwDate(Date brwDate) {
		this.brwDate = brwDate;
	}

	public Date getNeedDate() {
		return this.needDate;
	}

	public void setNeedDate(Date needDate) {
		this.needDate = needDate;
	}

	public Date getRtnDate() {
		return this.rtnDate;
	}

	public void setRtnDate(Date rtnDate) {
		this.rtnDate = rtnDate;
	}

	public Boolean getHasRtn() {
		return this.hasRtn;
	}

	public void setHasRtn(Boolean hasRtn) {
		this.hasRtn = hasRtn;
	}
	public User1 getUser(){
		return this.user;
	}
	public void setUser(User1 user){
		this.user=user;
	}
	public Book getBook(){
		return this.book;
	}
	public void setBook(Book book){
		this.book=book;
	}
}