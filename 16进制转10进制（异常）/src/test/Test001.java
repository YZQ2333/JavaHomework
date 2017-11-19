/**
* @Title: Test001.java
* @Package test
* @Description: TODO(用一句话描述该文件做什么)
* @author YZQ2333
* @date 2017年11月18日上午10:22:30
* @version V1.0
*/
package test;
import java.util.Scanner;

/**
* @ClassName: Test001
* @Description: 16进制转10进制
* @author YZQ2333
* @date 2017年11月18日上午10:22:30
*
*/
public class Test001 {
	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args    参数
	* @return void    返回类型
	* @throws
	*/
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		calculate();
	}
	public static void calculate(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个16进制数：");
		String a=sc.nextLine();
		int b=0;
		try{
			b=Integer.parseInt(a,16);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(a+"不是16进制数");
			a="0";
		}
		finally{
			System.out.println("计算完成");
		}
		System.out.println("结果为:"+b);
	}

}
