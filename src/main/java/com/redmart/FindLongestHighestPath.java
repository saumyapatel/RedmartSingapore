package com.redmart;

public class FindLongestHighestPath {
	Integer[][] inputMatrix;
	PlaceDetails[][] placeDetailsArr;

	public FindLongestHighestPath(Integer[][] inputArr){
		this.inputMatrix = inputArr;
		this.placeDetailsArr = new PlaceDetails[inputArr.length][inputArr.length];
	}

	public Integer[][] getInputMatrix() {
		return inputMatrix;
	}

	public void setInputMatrix(Integer[][] inputMatrix) {
		this.inputMatrix = inputMatrix;
	}

	public String findOptimalPath() {
		for (int i = 0; i < this.inputMatrix.length; i++) {
			for (int j = 0; j < this.inputMatrix.length; j++) {
				placeDetailsArr[i][j] = new PlaceDetails(i, j, inputMatrix[i][j], getInputMatrix());
			}
		}
		return null;
	}
}
