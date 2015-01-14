package org.action;
import java.util.Map;
import org.model.User1;
import org.model.Book;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import org.service.IUserService;
import org.service.IBookService;
import org.service.IBorrowService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class UserAction extends ActionSupport {
	protected User1 user;
	protected Book book;
	protected IUserService userService;
	protected IBookService bookService;
	protected IBorrowService borrowService;
	protected String pass0;
	protected String pass1;
	protected String pass2;

	public User1 getUser() {
		return this.user;
	}
	public void setUser(User1 user) {
		this.user = user;
	}
	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	public void setPass0(String pass0) {
		this.pass0 = pass0;
	}
	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	public void setBorrowService(IBorrowService borrowService) {
		this.borrowService = borrowService;
	}
	
	
	// 注册
	public String register() throws Exception {
		Map request=(Map)ActionContext.getContext().get("request");
		String regMsg="";
		//用户名已存在
		if (userService.exitUser(user.getUname()))
		{
			regMsg="该用户名已存在！";
			request.put("regMsg",regMsg);
			return ERROR;
		}
		if (user.getUname().equals("")||user.getUpass().equals(""))
		{
			regMsg="用户或密码不能为空！";
			request.put("regMsg",regMsg);
			return ERROR;
		}
		User1 user1 = new User1();
		user1.setUname(user.getUname());
		user1.setUpass(user.getUpass());
		user1.setUtype(1);
		userService.saveUser(user1);
		return SUCCESS;
	}
	// 用户登录验证
	public String login() throws Exception {
		Map request=(Map)ActionContext.getContext().get("request");
		String loginMsg="";
		if (user.getUname().equals("")||user.getUpass().equals(""))
		{
			loginMsg="用户或密码不能为空！";
			request.put("loginMsg",loginMsg);
			return ERROR;
		}
		List list = userService.validateUser(user.getUname(), user
				.getUpass());
		if (list.size()>0) {
			Map session = ActionContext.getContext().getSession();
			session.put("user", (User1)list.get(0));
			return SUCCESS;
		} else {
			loginMsg="用户或密码不正确！";
			request.put("loginMsg",loginMsg);
			return ERROR;
		}
	}
	// 用户注销
	public String logout() throws Exception{
		//用户注销
		Map session=ActionContext.getContext().getSession();
		session.remove("user");
		return SUCCESS;
	}
	// 显示收藏
	public String showMark() throws Exception{
		Map session = ActionContext.getContext().getSession();
		User1 user1=(User1)session.get("user");
		if (user1==null){
			return ERROR;
		}
		User1 user2=userService.getUserById(user1.getUid());
		Set marks=user2.getMarks();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("marks",marks);
		return SUCCESS;
	}
	//收藏图书
	public boolean mark(int bookid) throws Exception{
		Map session = ActionContext.getContext().getSession();
		User1 user1=(User1)session.get("user");
		Book book1=bookService.getBookById(bookid);
		User1 user2=userService.getUserById(user1.getUid());
		Set list=user2.getMarks();
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Book book2=(Book)iter.next();
			if (book2.getBid().equals(book1.getBid())){
				return false;
			}
		}
		list.add(book1);
		user1.setMarks(list);
		userService.updateUser(user1);
		return true;
	}
	//取消收藏
	public String delmark() throws Exception{
		Map session = ActionContext.getContext().getSession();
		User1 user1=(User1)session.get("user");
		if (user1==null) return ERROR;
		User1 user2=userService.getUserById(user1.getUid());
		Set list=user2.getMarks();
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Book book2=(Book)iter.next();
			if (book2.getBid().equals(book.getBid())){
				iter.remove();
			}
		}
		user2.setMarks(list);
		userService.updateUser(user2);
		return SUCCESS;
	}
	//修改密码
	public String changePass() throws Exception{
		Map session = ActionContext.getContext().getSession();
		User1 user1=(User1)session.get("user");
		if (user1==null) return LOGIN;
		User1 user2=userService.getUserById(user1.getUid());
		Map request=(Map)ActionContext.getContext().get("request");
		String errMsg="";
		if (!user2.getUpass().equals(pass0)){
			errMsg="原始密码不正确";
			request.put("errMsg",errMsg);
			return ERROR;
		}
		if (pass1==null||pass1.equals("")){
			errMsg="密码不能为空！";
			request.put("errMsg",errMsg);
			return ERROR;
		}
		user2.setUpass(pass1);
		userService.updateUser(user2);
		return SUCCESS;
	}
}