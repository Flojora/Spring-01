package com.wildcodeschool.myProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/doctor/10")
	@ResponseBody
	public String index1() {
		return "David Tennant";}
	
	@RequestMapping("/doctor/11")
	@ResponseBody
	public String index2() {
		return "Matt Smith";}
	
	@RequestMapping("/doctor/12")
	@ResponseBody
	public String index3() {
		return "Peter Capaldi";}
	
	@RequestMapping("/doctor/13")
	@ResponseBody
	public String index4() {
		return "Jodie Whittaker";}
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String s = "<ul>"
				+ "<li><a href='http://localhost:8080/doctor/10'>page1</a>"
				+ "<li><a href='http://localhost:8080/doctor/11'>page2</a>"
				+ "<li><a href='http://localhost:8080/doctor/12'>page3</a>"
				+ "<li><a href='http://localhost:8080/doctor/13'>page4</a>"
				+ "</ul>";
		return s;
		
}
}

	