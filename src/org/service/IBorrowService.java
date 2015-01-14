package org.service;
import org.model.Borrow;
import java.util.List;
public interface IBorrowService {
	public void saveBorrow(Borrow borrow);
	public List FindBorrowByUid(int uid);
}