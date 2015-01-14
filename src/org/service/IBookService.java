package org.service;
import java.util.List;
import org.model.Book;
public interface IBookService {
	public List FindBooksByName(String bname);
	public Book getBookById(int bookid);
}
