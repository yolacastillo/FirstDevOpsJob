package aforo255.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController { //2022-09-20

	@GetMapping("/test")
	public String TestFirstJob() {
		return "2022-09-20 Welcome to MasterDevops |Tomcat v1345 | Ansible , AFORO255";
	}
}
