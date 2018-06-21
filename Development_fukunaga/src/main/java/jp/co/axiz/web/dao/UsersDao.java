package jp.co.axiz.web.dao;

import java.util.List;

import jp.co.axiz.web.entity.Users;

public interface UsersDao {
	public List<Users> login(String id,String pass);
	public List<Users> idCheck(String id);
	public void regist(String id, String nic, String pass);
	public void rankChange(String id, String rank_id);
	public void unsub(String id);
	public List<Users> idSerch(String id);

}
