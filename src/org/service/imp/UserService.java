package org.service.imp;
import org.dao.IUserDAO;
import org.service.IUserService;
import org.model.User1;
import java.util.List;
public class UserService implements IUserService {
	private IUserDAO userDAO;
	public void setUserDAO(IUserDAO userDAO)
	{
		this.userDAO=userDAO;
	}
	public void saveUser(User1 user)
	{
		this.userDAO.saveUser(user);
	}
	public void updateUser(User1 user)
	{
		this.userDAO.updateUser(user);
	}
	public boolean exitUser(String username){
		return userDAO.exitUser(username);
	}
	public List validateUser(String username,String pass){
		return userDAO.validateUser(username,pass);
	}
	public User1 getUserById(int userid){
		return userDAO.getUserById(userid);
	}
}
