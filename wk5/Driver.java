package wk5;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dao dao=new Dao();
		ArrayList<Student> stuList=dao.InputStudentFromKeyboard();
		ArrayList<Course> couList=dao.InputCourseFromKeyboard();
		ArrayList<Student> studentList=dao.processStudent(stuList, couList);
		ArrayList<Result> resultList=dao.processCourse(couList);
		dao.print(studentList, resultList);

	}

}
