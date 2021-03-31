package com.cos.blog.controller;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Test {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if(i%10==0) {
				sum +=i;
			}
		}
//		System.out.println(sum);
		int sum1 = 0;
		
		for (int i=1; i<=100; i++) {
			if(i%3!=0) {
				sum1 +=i;
//				System.out.println(i);
			}
		}
//		System.out.println(sum1);
		int sum2=0;
//		제가 얼마전 신입면접 보러가서 손코딩 받은 문제가 1부터 1000까지 3이나 5의 배수 합 구하기 였어용!
		for(int i=1; i<1000; i++) {
			if(i%3==0 || i%5==0) {
				sum2 += i;
			}
		}
//		System.out.println(sum2);
		
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//				System.out.printf("%d*%d=%d\n",i,j,i*j);
			}
		}
		for(int i=1; i<=5; i++) {
			for(int k=5; k>0; k--) {
				if(k>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}	
}