package jp.co.axiz.web.entity;

public class Form {
private String id;
private String nic;
private String pass;
private String rePass;
private String content;
private String rank;
private String like;

public String getRank() {
	return rank;
}

public void setRank(String rank) {
	this.rank = rank;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public String getRePass() {
	return rePass;
}

public void setRePass(String rePass) {
	this.rePass = rePass;
}

public String getNic() {
	return nic;
}

public void setNic(String nic) {
	this.nic = nic;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
}
