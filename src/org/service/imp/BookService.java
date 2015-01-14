package org.service.imp;

import java.util.List;
import org.model.Book;
import org.dao.IBookDAO;
import org.service.IBookService;
public class BookService implements IBookService {
	private IBookDAO bookDAO;
	public void setBookDAO(IBookDAO bookDAO)
	{
		this.bookDAO=bookDAO;
	}
	@Override
	public List FindBooksByName(String bname) {
		// TODO Auto-generated method stub
		return bookDAO.FindBooksByName(bname);
	}
	public Book getBookById(int bookid){
		return bookDAO.getBookById(bookid);
	}
}
