package org.model;



/**
 * Mark entity. @author MyEclipse Persistence Tools
 */

public class Mark  implements java.io.Serializable {


    // Fields    

     private Integer mid;
     private Integer uid;
     private Integer bid;


    // Constructors

    /** default constructor */
    public Mark() {
    }

    
    /** full constructor */
    public Mark(Integer uid, Integer bid) {
        this.uid = uid;
        this.bid = bid;
    }

   
    // Property accessors

    public Integer getMid() {
        return this.mid;
    }
    
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getUid() {
        return this.uid;
    }
    
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getBid() {
        return this.bid;
    }
    
    public void setBid(Integer bid) {
        this.bid = bid;
    }
   








}