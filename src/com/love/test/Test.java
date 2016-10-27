package com.love.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {0,1,1,1,0,1,0,0,2,2,0,2,3,3,3,3,1}; 
		Arrays.sort(array);
		System.out.println(getLessEleCount(array, 0));
	}
	
	/**
	 * 统计已经排过序的数组中相同元素的个数
	 * @param array
	 * @return key为元素值,value为元素个数
	 */
	public static TreeMap<Integer, Integer> countArrayElementNum(int[] array) {
		if(null!=array&&0<array.length) {
			TreeMap<Integer, Integer> nums = new TreeMap<Integer, Integer>();
			int temp = array[0];
			int count = 0;
			for(int i = array.length-1;i>=0;i--) {
				if(temp == array[i]) {
					count ++;
				}else {
					nums.put(new Integer(temp), count);
					
					temp = array[i];
					count = 1;
				}
			}
			nums.put(new Integer(temp), count);//结束循环,将最后的一组相同的元素及元素个数进行保存
			return nums;
		}else {
			return null;
		}
	}
	
	/**
	 * 得到从小到大排列顺序的数组中小于某个数(该数存在数组中)的所有元素个数
	 * @param array
	 * @param elem
	 * @return
	 */
	public static int getLessEleCount(int[] array, int elem) {
		if(0 <= Arrays.binarySearch(array, elem)) {
			int num = 0;
			TreeMap<Integer, Integer> map = countArrayElementNum(array);
			for(Integer it : map.keySet()) {
				System.out.println("element "+it.intValue() +" num is "+map.get(it).intValue());
			}
			if(null!=map&&0<map.size()) {
				Iterator<Integer> itr = map.keySet().iterator();
				while(itr.hasNext()) {
					Integer key = itr.next();
					if(key.intValue() < elem) {
						num += map.get(key).intValue();
					}else {
						break;
					}
				}
			}
			return num;
		}else {
			return 0;
		}
	}
}
