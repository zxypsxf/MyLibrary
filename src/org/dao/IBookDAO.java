package org.dao;
import org.model.Book;
import java.util.List;
public interface IBookDAO {
	public List FindBooksByName(String bname);
	public Book getBookById(int bookid);
}
