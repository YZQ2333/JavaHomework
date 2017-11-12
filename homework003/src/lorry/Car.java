/**
* @Title: Car.java
* @Package lorry
* @Description: TODO(用一句话描述该文件做什么)
* @author YZQ2333
* @date 2017年11月12日下午3:43:10
* @version V1.0
*/
package lorry;
/**
* @ClassName: Car
* @Description: TODO(这里用一句话描述这个类的作用)
* @author YZQ2333
* @date 2017年11月12日下午3:43:10
*
*/
public class Car {
	private static ComputerWeight []goods=new ComputerWeight[3];
	
	
	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args    参数
	* @return void    返回类型
	* @throws
	*/
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		goods[0]=new Computer();
		goods[1]=new Televeision();
		goods[2]=new WashMachine();
		System.out.println(goods[0].computerWeight()+goods[1].computerWeight()+goods[2].computerWeight());
	}

}
