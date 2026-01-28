package com.wacaw.exam02;

public class ArrayTest04 {
	public static void main(String[] args) {
		int sales[] = { 52, 62, 30, 95, 77, 0, 100 };
		char graph[][] = new char[10][7];
		
		// 온점으로 초기화 
		for(int r=0;r<10;r++) {
			for(int c=0;c<7;c++) {
				graph[r][c]='.';
			}
		}
		
		// 연산
		for(int c=0;c<7;c++) {
			int amount=sales[c]/10;
			for(int r=amount-1;r>-1;r--) {
				graph[9-r][c]='0';
			}
		}
		
		// 출력
		for(char[] row:graph) {
			for(char element:row) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		System.out.println("1 2 3 4 5 6 7");
		
		
		// 정답 코드 
//		for (int i = 0; i < graph.length; i++)
//			for (int j = 0; j < graph[0].length; j++)
//				graph[i][j] = '.';
//
//		for (int i = 0; i < sales.length; i++) {
//			for (int k = 0; k < sales[i] / 10; k++) {
//				graph[graph.length - 1 - k][i] = 'O';
//			}
//		}
//
//		System.out.println("-----<그래프>------");
//		for (int i = 0; i < graph.length; i++) {
//			for (int j = 0; j < graph[0].length; j++) {
//				System.out.printf("%c ", graph[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("-------------------");
//		System.out.println("1 2 3 4 5 6 7 ");
	}
}
