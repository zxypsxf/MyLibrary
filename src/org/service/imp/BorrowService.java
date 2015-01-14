package org.service.imp;

import java.util.List;

import org.model.Borrow;
import org.dao.IBorrowDAO;
import org.service.IBorrowService;

public class BorrowService implements IBorrowService {
	private IBorrowDAO borrowDAO;
	public void setBorrowDAO(IBorrowDAO borrowDAO){
		this.borrowDAO=borrowDAO;
	}
	
	@Override
	public void saveBorrow(Borrow borrow) {
		// TODO Auto-generated method stub
		this.borrowDAO.saveBorrow(borrow);
	}

	@Override
	public List FindBorrowByUid(int uid) {
		// TODO Auto-generated method stub
		return this.borrowDAO.FindBorrowByUid(uid);
	}

}
