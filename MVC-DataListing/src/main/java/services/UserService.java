package services;
import java.util.ArrayList;
import java.util.List;
import model.UserBean;

public class UserService {


	
	public List<UserBean> getList(){
		List<UserBean> userList= new ArrayList<UserBean>();
		UserBean bean = new UserBean();
		bean.setDate("04/22/2012");
		bean.setDescription("Hi");
		bean.setName("David");
		bean.setPrice(56);
		bean.setQuantity(10);
		
		userList.add(bean);
		
		bean = new UserBean();
		bean.setDate("02/02/2016");
		bean.setDescription("Hello");
		bean.setName("Jonn");
		bean.setPrice(100);
		bean.setQuantity(5);
		userList.add(bean);
		return userList;
	}
}
