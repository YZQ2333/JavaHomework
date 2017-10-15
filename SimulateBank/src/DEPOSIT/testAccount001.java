/**
* @Title: testAccount001.java
* @Package DEPOSIT
* @Description: TODO(用一句话描述该文件做什么)
* @author YZQ2333
* @date 2017年10月14日下午1:56:29
* @version V1.0
*/
package DEPOSIT;

/**
* @ClassName: testAccount001
* @Description: TODO(这里用一句话描述这个类的作用)
* @author YZQ2333
* @date 2017年10月14日下午1:56:29
*
*/
public class testAccount001 {
	public static void main(String args[]){
		DepositAccount saver=new DepositAccount();
		saver.setAccountNumber(1234567890);
		saver.setName("ZhangSan");
		saver.setBalance(5000);
		System.out.println("姓名："+saver.getName());
		System.out.println("账户："+saver.getAccountNumber());
		saver.save(2000);
		saver.yearbalance(2);
	}

}