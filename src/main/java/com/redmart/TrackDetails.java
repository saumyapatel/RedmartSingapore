package com.redmart;

import java.util.LinkedList;

public class TrackDetails {
	LinkedList<PlaceDetails> path = new LinkedList<PlaceDetails>();
	Integer pathValue = 0;
	Integer pathLength = 0;

	public void addToPath(PlaceDetails placeDetails) {
		this.path.add(placeDetails);
		this.setPathLength(this.pathLength + 1);
		this.setPathValue(this.pathValue + placeDetails.value);
	}

	public LinkedList<PlaceDetails> getPath() {
		return path;
	}

	public void setPath(LinkedList<PlaceDetails> path) {
		this.path = path;
	}

	public Integer getPathValue() {
		return pathValue;
	}

	public void setPathValue(Integer pathValue) {
		this.pathValue = pathValue;
	}

	public Integer getPathLength() {
		return pathLength;
	}

	public void setPathLength(Integer pathLength) {
		this.pathLength = pathLength;
	}

}
