package jp.co.axiz.web.service;

import java.util.List;

import jp.co.axiz.web.entity.Users;

public interface UsersService {

	public Users login(String id, String pass);
	public boolean idCheck(String id);
	public void regist(String id, String nic, String pass);
	public void rankChange(String id, String rank_id);
	public void unsub(String id);
	public List<Users> serchId(String id);

}
