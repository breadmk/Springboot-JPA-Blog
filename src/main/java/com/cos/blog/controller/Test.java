package com.cos.blog.controller;

public class Test {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if(i%10==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}
}