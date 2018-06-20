package jp.co.axiz.web.entity;

public class Users {
private String user_id;
private String user_nic;
private String password;
private String rank_id;
public String getRank() {
	return rank;
}

public void setRank(String rank) {
	this.rank = rank;
}

private String rank;

public Users() {

}

public Users(String user_id, String user_nic, String password, String rank_id) {
	this.user_id=user_id;
	this.user_nic=user_nic;
	this.password=password;
	this.rank_id=rank_id;
}

public String getUser_id() {
	return user_id;
}

public void setUser_id(String user_id) {
	this.user_id = user_id;
}

public String getUser_nic() {
	return user_nic;
}

public void setUser_nic(String user_nic) {
	this.user_nic = user_nic;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getRank_id() {
	return rank_id;
}

public void setRank_id(String rank_id) {
	this.rank_id = rank_id;
}
}
