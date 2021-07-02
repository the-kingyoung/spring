package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
//		ExamConsole console = new InlineExamConsole(exam);	//DI
//		ExamConsole console = new GridExamConsole(exam);	이처럼 소스코드 변경을 해야하는 일을 대신 해줄수 있는 것이 spring이다.
		
		/*	스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		Exam exam = new NewlecExam(10,10,10,10);
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				//new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		
		ExamConsole console =(ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class);
		console.print(); 
		//https://www.youtube.com/watch?v=gtqctgfywn4&list=PLq8wAnVUcTFUHYMzoV2RoFoY2HDTKru3T&index=5
		
//		List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
//		exams.add(new NewlecExam(1,1,1,1));
		
//		for(Exam e : exams)
//			System.out.println(e);
		
	}

}
