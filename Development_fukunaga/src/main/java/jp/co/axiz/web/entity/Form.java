package jp.co.axiz.web.entity;

public class Form {
private String id;
private String nic;
private String pass;
private String rePass;
private String content;
private String rank;
private String like;
private String genre_id;
private String rank_id;

public String getRank_id() {
	return rank_id;
}

public void setRank_id(String rank_id) {
	this.rank_id = rank_id;
}

public String getLike() {
	return like;
}

public void setLike(String like) {
	this.like = like;
}

public String getGenre_id() {
	return genre_id;
}

public void setGenre_id(String genre_id) {
	this.genre_id = genre_id;
}

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
