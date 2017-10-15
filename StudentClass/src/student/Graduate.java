/**
* @Title: Graduate.java
* @Package student
* @Description: TODO(用一句话描述该文件做什么)
* @author YZQ2333
* @date 2017年10月15日下午2:56:40
* @version V1.0
*/
package student;

/**
* @ClassName: Graduate
* @Description: TODO(这里用一句话描述这个类的作用)
* @author YZQ2333
* @date 2017年10月15日下午2:56:40
*
*/
public class Graduate extends Students {
	private String direction;
	/**
	* 创建一个新的实例 Graduate.
	*
	* @param name
	* @param age
	* @param education
	*/
	public Graduate(String name, int age, String education,String direction) {
		super(name, age, education);
		this.direction=direction;
		// TODO 自动生成的构造函数存根
	}
	public void show(){
		System.out.println("姓名："+super.getName());
		System.out.println("年龄："+super.getAge());
		System.out.println("学历："+super.getEducation());
		System.out.println("研究方向："+direction);
	}

}
