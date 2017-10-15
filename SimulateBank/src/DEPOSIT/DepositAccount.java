/**
* @Title: DepositAccount.java
* @Package DEPOSIT
* @Description: TODO(用一句话描述该文件做什么)
* @author YZQ2333
* @date 2017年10月13日下午7:13:21
* @version V1.0
*/
package DEPOSIT;
import java.sql.*;
/**
* @ClassName: DepositAccount
* @Description: TODO(这里用一句话描述这个类的作用)
* @author YZQ2333
* @date 2017年10月13日下午7:13:21
*
*/
public class DepositAccount {
	private int AccountNumber;
	private String name;
	private double balance;
	static float year_rate=0.023f;
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.AccountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	//存款方法
	public void save(int money){
		this.balance=balance+money;
		System.out.println("存入金额为："+money+"元");
	}
	//计算余额和年利息的方法
	 public void yearbalance (int year){
		 double nowbalance=this.balance*Math.pow(1+year_rate,year);
		 System.out.println("存款时间为："+year+"年");
		 System.out.println("现在的余额为："+nowbalance+"元");
		 System.out.println("年利息为："+(nowbalance-balance)/year+"元");
	 }
}
