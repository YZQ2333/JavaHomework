/**
* @Title: TestExtends.java
* @Package student
* @Description: TODO(用一句话描述该文件做什么)
* @author YZQ2333
* @date 2017年10月15日下午3:00:49
* @version V1.0
*/
package student;

/**
* @ClassName: TestExtends
* @Description: TODO(这里用一句话描述这个类的作用)
* @author YZQ2333
* @date 2017年10月15日下午3:00:49
*
*/
public class TestExtends {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args    参数
	* @return void    返回类型
	* @throws
	*/
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 Undergraduate a=new Undergraduate("王明",23,"本科生","软件工程");
		 a.show();
		 Graduate b=new Graduate("李强",24,"研究生","大数据");
		 b.show();
	}

}
