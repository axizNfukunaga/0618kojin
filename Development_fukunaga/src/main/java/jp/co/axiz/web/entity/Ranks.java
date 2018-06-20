package jp.co.axiz.web.entity;

public class Ranks {
	private String rank_id;
	private String rank;

	public Ranks() {

	}
	public Ranks(String rank_id, String rank) {
		this.rank_id=rank_id;
		this.rank=rank;
	}
	public String getRank_id() {
		return rank_id;
	}
	public void setRank_id(String rank_id) {
		this.rank_id = rank_id;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
}
