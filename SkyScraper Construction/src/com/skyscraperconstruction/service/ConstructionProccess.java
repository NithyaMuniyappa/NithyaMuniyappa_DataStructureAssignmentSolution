package com.skyscraperconstruction.service;

import java.util.Stack;

public class ConstructionProccess
{
 public  void findFloorsAssembledPerDay(int floorSize[])
 {
	 Stack<Integer> stack = new Stack<Integer>();
	 int maxFloorSize= findMaxFloorSize(floorSize);
	 for(int i=0;i<floorSize.length;i++)
	 {
		stack.push(floorSize[i]);
		System.out.println("Day: "+(i+1));
			while(!stack.isEmpty()&&stack.peek()==maxFloorSize)
			{
			 System.out.print(stack.pop()+" ");
			 maxFloorSize--;
		     }
			System.out.println(" "); 
	 } 
 }
 
 static int findMaxFloorSize(int floorSize[])
 {
	 int maxNum= 0;
	 for(int i=0;i<floorSize.length;i++)
	 {
		 if(floorSize[i]>maxNum)
		 {
			 maxNum=floorSize[i];
		 }
	 }
	 return maxNum;
 }
}
