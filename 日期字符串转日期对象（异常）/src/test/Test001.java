/**
* @Title: Test001.java
* @Package test
* @Description: TODO(用一句话描述该文件做什么)
* @author YZQ2333
* @date 2017年11月18日上午11:45:18
* @version V1.0
*/
package test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
* @ClassName: Test001
* @Description: 将日期字符串转换为日期对象
* @author YZQ2333
* @date 2017年11月18日上午11:45:18
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
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入日期，例如2016/9/10：");
		Scanner scanner=new Scanner(System.in);
		String temp=scanner.nextLine();
		System.out.println(getDate(temp));

	}
	public static Date getDate(String date){
		DateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		try{
			return new Date(format.parse(date).getTime());
		}
		catch(ParseException e){
			e.printStackTrace();
			System.out.println("日期格式有误");
			date=null;
		}
		finally{
			System.out.println("转换完成");
		}
		return null;
	}

}
