package com.redmart;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
	public Integer[][] readFile() {
		Path path;
		try {
			path = Paths.get(ClassLoader.getSystemResource("input.txt").toURI());

			try (Stream<String> lines = Files.lines(path)) {
				List<String> inputLines = new ArrayList();
				//lines.forEachOrdered(s -> System.out.println(s));

				inputLines = lines.collect(Collectors.toList());
				
				String size[] = inputLines.get(0).split(" ");
				Integer [][] array = new Integer[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
				
				for(int i=1;i<inputLines.size();i++){
					String [] row = inputLines.get(i).split(" ");
					for(int j=0;j<inputLines.size()-1;j++){
						array[i-1][j] = Integer.parseInt(row[j]);}
				}
				return array;

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
