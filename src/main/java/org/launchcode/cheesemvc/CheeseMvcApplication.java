package org.launchcode.cheesemvc;

//DevTools:
//https://stackoverflow.com/questions/33869606/intellij-15-springboot-devtools-livereload-not-working/50198253

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheeseMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheeseMvcApplication.class, args);
	}

}
