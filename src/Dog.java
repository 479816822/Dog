import java.sql.SQLClientInfoException;
import java.util.InputMismatchException;

public class Dog {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws  InputMismatchException{
	
			if(age<0||age>30){
	//		throw new InputMismatchException("�������䲻��:��������:");	
			}else

		this.age = age;
		}
	
	
}
