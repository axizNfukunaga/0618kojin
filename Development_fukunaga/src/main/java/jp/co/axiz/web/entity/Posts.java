package jp.co.axiz.web.entity;

import java.util.Date;

public class Posts {
	private Integer posts_id;
	private String user_id;
	private String contents;
	private Integer browsing_point;
	private Date date;
	private String genre_id;
	private String user_nic;
	private String genre;
	public String getUser_nic() {
		return user_nic;
	}
	public void setUser_nic(String user_nic) {
		this.user_nic = user_nic;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Posts() {

	}
	public Posts(Integer posts_id, String user_id, String contents, Integer browsing_point, Date date, String genre_id) {
		this.posts_id=posts_id;
		this.user_id=user_id;
		this.contents=contents;
		this.browsing_point=browsing_point;
		this.date=date;
		this.genre_id=genre_id;
	}
	public Integer getPosts_id() {
		return posts_id;
	}

	public void setPosts_id(Integer posts_id) {
		this.posts_id = posts_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Integer getBrowsing_point() {
		return browsing_point;
	}

	public void setBrowsing_point(Integer browsing_point) {
		this.browsing_point = browsing_point;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(String genre_id) {
		this.genre_id = genre_id;
	}


}
