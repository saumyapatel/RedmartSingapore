package com.redmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedmartSingaporeApplication {

	public static void main(String[] args) {
		// SpringApplication.run(RedmartSingaporeApplication.class, args);

		ReadFile readFile = new ReadFile();
		Integer[][] inputArr = readFile.readFile();
		FindLongestHighestPath flhp = new FindLongestHighestPath(inputArr);
		flhp.findOptimalPath();
	}
}
