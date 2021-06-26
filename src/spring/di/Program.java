package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole(exam);	//DI
//		ExamConsole console = new GridExamConsole(exam);	이처럼 소스코드 변경을 해야하는 일을 대신 해줄수 있는 것이 spring이다.
		console.print();
//https://www.youtube.com/watch?v=gtqctgfywn4&list=PLq8wAnVUcTFUHYMzoV2RoFoY2HDTKru3T&index=5
	}

}
