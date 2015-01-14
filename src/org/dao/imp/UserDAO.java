package org.dao.imp;
import org.model.User1;
import org.dao.IUserDAO;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class UserDAO extends HibernateDaoSupport implements IUserDAO{
	public void saveUser(User1 user){
		this.getHibernateTemplate().save(user);
	}
	public void updateUser(User1 user){
		this.getHibernateTemplate().update(user);
	}
	public boolean exitUser(String username){
		List list=this.getHibernateTemplate().find("from User1 where uname=?",username);
		if(list.size()>0)
			return true;
		else
			return false;
	}
	public List validateUser(String username,String pass){
		List list=this.getHibernateTemplate().find("from User1 where uname=? and upass=?",username,pass);	
		return list;
	}
	public User1 getUserById(int userid){
		List list=this.getHibernateTemplate().find("from User1 where uid =?",userid);
		if(list.size()>0)
			return (User1)list.get(0);
		else
			return null;
		}
}
