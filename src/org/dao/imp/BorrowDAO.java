package org.dao.imp;

import java.util.List;

import org.dao.IBorrowDAO;
import org.model.Borrow;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class BorrowDAO extends HibernateDaoSupport implements IBorrowDAO {

	@Override
	public void saveBorrow(Borrow borrow) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(borrow);
	}

	@Override
	public List FindBorrowByUid(int uid) {
		// TODO Auto-generated method stub
		List list=this.getHibernateTemplate().find("from Borrow b where b.user.uid=?",uid);
		return list;
	}

}
