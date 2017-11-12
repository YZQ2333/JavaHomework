/**
* @Title: Graduate.java
* @Package school
* @Description: TODO(用一句话描述该文件做什么)
* @author YZQ2333
* @date 2017年11月12日下午4:21:11
* @version V1.0
*/
package school;

/**
* @ClassName: Graduate
* @Description: TODO(这里用一句话描述这个类的作用)
* @author YZQ2333
* @date 2017年11月12日下午4:21:11
*
*/
public class Graduate implements StudentManageInterface,TeacherManageInterface{
	private String name;
	private String sex;
	private int age;
	private int fee;
	private int pay;
	Graduate (String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public int setPay(int pay) {
		return this.pay=pay;
	}
	
	public int getPay() {
		return this.pay;
	}
	
	public int setFee(int fee) {
		return this.fee=fee;
	}
	
	public int getFee() {
		return this.fee;
	}
	public static void main(String[] args) {
		Graduate zhangsan=new Graduate("zhangsan","男",24);
		zhangsan.setFee(4000);
		zhangsan.setPay(3000);
		if(12*zhangsan.pay-2*zhangsan.fee<2000)
			System.out.println("provide a loan");
		else
			System.out.println("no need for a loan");
	}
}
