package com.javaex.ex02;

import java.io.IOException;

public class FileApp {

	
	// 2번 문제: Throw 했는데도 왜 에러가 발생했을까?
	// IOException은 대표적인 CheckedException 이라서 Throw 해도 반드시 예외처리가 필요하기 때문
	public static void main(String[] args) {

		try {
			fileRead();
		} catch(IOException e) {
			System.err.println("파일이 없습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

	// 수정하지 마세요
	public static void fileRead() throws IOException{
		throw new IOException(); // 강제로 예외 발생
	}
}


