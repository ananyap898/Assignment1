package com.java.assignment2;

public class House {
	private String house;
	private int window;
	private int door;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + door;
		result = prime * result + ((house == null) ? 0 : house.hashCode());
		result = prime * result + window;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (door != other.door)
			return false;
		if (house == null) {
			if (other.house != null)
				return false;
		} else if (!house.equals(other.house))
			return false;
		if (window != other.window)
			return false;
		return true;
	}
	
	

}
