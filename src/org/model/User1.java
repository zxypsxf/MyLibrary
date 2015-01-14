package org.model;
import java.util.HashSet;
import java.util.Set;
/**
 * User1 entity. @author MyEclipse Persistence Tools
 */

public class User1 implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private String upass;
	private Integer utype;
	private Set marks=new HashSet();

	// Constructors

	/** default constructor */
	public User1() {
	}

	/** full constructor */
	public User1(String uname, String upass, Integer utype) {
		this.uname = uname;
		this.upass = upass;
		this.utype = utype;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return this.upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public Integer getUtype() {
		return this.utype;
	}

	public void setUtype(Integer utype) {
		this.utype = utype;
	}
	public Set getMarks(){
		return marks;
	}
	public void setMarks(Set marks){
		this.marks=marks;
	}
}