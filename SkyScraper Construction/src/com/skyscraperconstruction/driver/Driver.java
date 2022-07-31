package com.skyscraperconstruction.driver;

import java.util.Scanner;

import com.skyscraperconstruction.service.ConstructionProccess;

public class Driver
{
	public static void main(String[] args)
	{
		ConstructionProccess pr = new ConstructionProccess();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building :");
		int noOfFloors = input.nextInt();
		int floorSize[] = new int[noOfFloors];
		
		for(int i=0;i<noOfFloors;i++)
		{
		 System.out.println("Enter the floor size given on day : " + (i+1));
		 floorSize[i]=input.nextInt();		
		}
		input.close();
		System.out.println("The order of construction is as follows ");
		pr.findFloorsAssembledPerDay(floorSize);
	}

}
