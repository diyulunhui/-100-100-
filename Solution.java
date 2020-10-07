package zifuchuan;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Collectors;


@SuppressWarnings("unused")
class Solution {
	//在100万个数中找出前100大的数//n为100
	public static int[] selectNumbersFromBigData(int[]nums,int n)
	 {
		 int[]result=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 result[i]=nums[i];
		 }
		 for(int i=n-1;i>n/2;i--)
		 {
			 judge(result,i);
		 }
		 for(int i=n;i<nums.length;i++)
		 {
			 int x=nums[i];
			 if(result[0]<x)
			 {
				 result[0]=nums[i];
				 judge(result,0);
			 }
		 }
		 return result;
	 }
	
	public static void judge(int[]nums,int index)
	{
		if(index>=nums.length)return;
		int i=index*2+1;
        while(i<nums.length)
        {
        	 i=index*2+1;
        	 if(i>=nums.length)break;
        	if(i+1<nums.length&&nums[i]>nums[i+1])
        	{
        		i=i+1;
        	}
        	if(nums[index]<nums[i])break;
        	int temp=nums[i];
        	nums[i]=nums[index];
        	nums[index]=temp;
        	index=i;
        }
	}
	
	
	public static void main(String[] args) {
		int[]nums=new int[1000];
		for(int i=0;i<1000;i++)
		{
			nums[i]=i;
		}
		int[]result=selectNumbersFromBigData(nums,10);
		for(int x:result)
		{
			System.out.print(x+" ");
		}
	}
	}






