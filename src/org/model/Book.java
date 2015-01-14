package org.model;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class Book implements java.io.Serializable {

	// Fields

	private Integer bid;
	private String bname;
	private String publisher;
	private String author;
	private Integer totalNum;
	private Integer borrowNum;
	private String addr;

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** full constructor */
	public Book(String bname, String publisher, String author,
			Integer totalNum, Integer borrowNum, String addr) {
		this.bname = bname;
		this.publisher = publisher;
		this.author = author;
		this.totalNum = totalNum;
		this.borrowNum = borrowNum;
		this.addr = addr;
	}

	// Property accessors

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return this.bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getBorrowNum() {
		return this.borrowNum;
	}

	public void setBorrowNum(Integer borrowNum) {
		this.borrowNum = borrowNum;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}