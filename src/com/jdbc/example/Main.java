package com.jdbc.example;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
//DFS
public class Main {
	static int n,m; // n은 정점 , m은 간선
	static boolean visited[];
	static int answer ;
	static boolean com[][];
	
	static void dfs(int idx) {
		
		
		answer++;
		visited[idx] = true;
		
		
		
		for(int i = 1 ; i<= n ; i++) {
			if(!visited[i] && com[idx][i]) {
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		com = new boolean[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i = 1 ; i<= m ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			com[a][b] = com[b][a] = true;
			
		}
		dfs(1);
		System.out.println(answer -1);
	}
}