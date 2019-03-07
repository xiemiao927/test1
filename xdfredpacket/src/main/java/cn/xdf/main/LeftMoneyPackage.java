package cn.xdf.main;

public class LeftMoneyPackage {
	private String id ;
	
	private int remainSize ;//剩余的红包数量
	
	private Double remainMoney ;//剩余钱
	
	private int size ;// 总数
	
	private Double money ;//总钱
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public int getRemainSize() {
		return remainSize;
	}

	public void setRemainSize(int remainSize) {
		this.remainSize = remainSize;
	}

	public Double getRemainMoney() {
		return remainMoney;
	}

	public void setRemainMoney(Double remainMoney) {
		this.remainMoney = remainMoney;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
	
	
	
}
