package com.java.assignment2;

public class ToweOfHanoi {

	public static void main(String[] args) {
		
		towerOfHanoi(4,'A','c','B');
	}

	public static void towerOfHanoi(int n,char fromTower,char toTower,char auxilaryTower){
		if (n==1){
			System.out.println("remove"+n+"from "+fromTower +"to "+toTower );
			return;
		}
		 towerOfHanoi(n-1,fromTower,auxilaryTower,toTower);
			 System.out.println("remove"+n+"from "+fromTower +"to "+toTower );
			 towerOfHanoi(n-1,auxilaryTower,toTower,fromTower);
			 	
		 }
	
	     
		
	}
	
	

