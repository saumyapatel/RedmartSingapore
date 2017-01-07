package com.redmart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLongestHighestPath {
	Integer[][] inputMatrix;
	PlaceDetails[][] placeDetailsArr;
	List<TrackDetails> trackList = new ArrayList<TrackDetails>(); 

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
		List<PlaceDetails> sortedPlaceDetails = new ArrayList<PlaceDetails>();
		for (int i = 0; i < this.inputMatrix.length; i++) {
			for (int j = 0; j < this.inputMatrix.length; j++) {
				this.placeDetailsArr[i][j] = new PlaceDetails(i, j, inputMatrix[i][j], getInputMatrix());
				sortedPlaceDetails.add(this.placeDetailsArr[i][j]);
			}
		}

		Collections.sort(sortedPlaceDetails, Collections.reverseOrder());
		
		sortedPlaceDetails.forEach(p -> System.out.println(p.value));
		
		return null;
	}
	
}
