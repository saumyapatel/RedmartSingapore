package com.redmart;

import java.util.ArrayList;
import java.util.List;

public class PlaceDetails {

	int x;
	int y;
	int value;
	boolean pathExists = false;
	List<Integer[]> neighbours = new ArrayList<Integer[]>();
	public PlaceDetails(int x,int y,int value, Integer[][] inputArr){
		this.x = x;
		this.y = y;
		this.value = value;
		getAvailablePaths(inputArr);
	}
	private void getAvailablePaths(Integer[][] inputArr){
		int length = inputArr.length;
		for(int i = this.x-1;i<this.x+2;i++){
			for(int j = this.y-1;j<this.y+2;j++){
				if(i > -1 && j > -1 && i < length && j < length ){
					checkPath(i, j,inputArr);
				}
			}
		}
		System.out.println(this.value + ":" + this.pathExists);
	}
	
	private void checkPath(int x,int y,Integer[][] inputArr){
		if(inputArr[x][y] < this.value){
			this.pathExists = true;
			Integer [] coordinates = new Integer[2];
			coordinates[0]=x;
			coordinates[1]=y;
			this.neighbours.add(coordinates);
		}
	}
}
