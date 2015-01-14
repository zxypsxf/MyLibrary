package org.dao;
import org.model.Borrow;
import java.util.List;
public interface IBorrowDAO {
	public void saveBorrow(Borrow borrow);
	public List FindBorrowByUid(int uid);
}
