package org.action;

import java.util.List;
import java.util.Map;
import org.service.IBookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class BookAction extends ActionSupport{
	protected IBookService bookService;
	protected String bname;
	public String getBname(){
		return bname;
	}
	public void setBname(String bname){
		this.bname=bname;
	}
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	// 图书检索
	public String find() throws Exception{
		List books=bookService.FindBooksByName(bname);
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("books",books);
		return SUCCESS;
	}
}
