package com.ssafy.happyhouse.exception;
/**
* 유저 이름에 숫자나 특수문자가 들어가는 상황에 대해서 에러처리 
* @author kkJeong
*/
public class UserNameException extends Exception{
	private static final long serialVersionUID = -2238030302650813813L;
	
	public UserNameException() {
		super("회원 이름에 숫자나 특수문자가 들어갈수 없습니다. ");
	}
}