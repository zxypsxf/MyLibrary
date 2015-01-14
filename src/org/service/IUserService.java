package org.service;
import org.model.User1;
import java.util.List;
public interface IUserService {
	public void saveUser(User1 user);
	public void updateUser(User1 user);
	public boolean exitUser(String username);
	public List validateUser(String username,String pass);
	public User1 getUserById(int userid);
}
