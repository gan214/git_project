package gan;

public class GG {

	private int id;
	private String username;
	private String password;
	private int sex;
	private String shuabi;	
	
	public GG(int id,String username,String password,int sex,String shuabi) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.shuabi = shuabi;
	}
	
	private int id2;
	
	public int getId2() {
		return id2 + 100;
	}
	public void setId2(int id2) {
		this.id2 = id2;
	}
}
