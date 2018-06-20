package jp.co.axiz.web.service;

import jp.co.axiz.web.entity.Users;

public interface UsersService {

	public Users login(String id, String pass);
	public boolean idCheck(String id);
	public void regist(String id, String nic, String pass);
	public void rankChange(String id, String rank_id);

}
