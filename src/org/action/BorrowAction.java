package org.action;

import java.util.Map;
import java.util.List;
import java.util.Iterator;
import org.model.User1;
import org.model.Book;
import org.model.Borrow;
import org.service.IBorrowService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class BorrowAction extends ActionSupport{
	protected IBorrowService borrowService;
	protected boolean showType;
	
	public void setBorrowService(IBorrowService borrowService) {
		this.borrowService = borrowService;
	}
	public void setShowType(boolean showType){
		this.showType=showType;
	}
	// 根据showType显示借书记录，
	public String showBorrow() throws Exception{
		Map session = ActionContext.getContext().getSession();
		User1 user1=(User1)session.get("user");
		if (user1==null){
			return ERROR;
		}
		List list=borrowService.FindBorrowByUid(user1.getUid());
		System.out.println(showType);
		System.out.println(list.size());
		if (list.size()>0){
			Borrow b2=(Borrow)list.get(0);
			System.out.println(b2.getBook().getBname());
		}
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Borrow borrow2=(Borrow)iter.next();
			if (borrow2.getHasRtn()!=showType){
				iter.remove();
			}
		}
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("list",list);
		request.put("type",showType);
		return SUCCESS;
	} 
}
