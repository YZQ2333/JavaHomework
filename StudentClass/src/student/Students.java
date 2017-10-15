/**
* @Title: Students.java
* @Package student
* @Description: TODO(用一句话描述该文件做什么)
* @author YZQ2333
* @date 2017年10月15日下午1:40:56
* @version V1.0
*/
package student;

/**
* @ClassName: Students
* @Description: TODO(这里用一句话描述这个类的作用)
* @author YZQ2333
* @date 2017年10月15日下午1:40:56
*
*/
public class Students {
	private String name;
	private int age;
	private String education;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEducation() {
		return education;
	}
	//构造方法
	public Students(){
		
	}
	public Students(String name,int age,String education){
		this.name=name;
		this.age=age;
		this.education=education;
	}
	//输出方法
	public void show(){
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("学历："+education);
	}

}
