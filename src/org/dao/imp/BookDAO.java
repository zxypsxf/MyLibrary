package org.dao.imp;
import org.dao.IBookDAO;
import org.model.Book;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class BookDAO extends HibernateDaoSupport implements IBookDAO{
	public List FindBooksByName(String bname){
		System.out.println(bname);
		List books=this.getHibernateTemplate().find("select a.bid,a.bname,a.publisher,a.author,a.totalNum,a.borrowNum,a.addr from Book a where a.bname like ?","%"+bname+"%");
		return books;
	}
	public Book getBookById(int bookid){
		List book=this.getHibernateTemplate().find("from Book where bid=?",bookid);
		if(book.size()>0)
			return (Book)book.get(0);
		else
			return null;
	}
}
