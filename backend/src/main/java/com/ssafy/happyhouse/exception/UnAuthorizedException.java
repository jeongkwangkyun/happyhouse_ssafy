package com.ssafy.happyhouse.exception;
/**
* 권한이 없는 유저가 서비스를 이용할 때 발생하는 에러 상황 
* @author kkJeong
*/
public class UnAuthorizedException extends RuntimeException {
	private static final long serialVersionUID = -2238030302650813813L;
	
	public UnAuthorizedException() {
		super("계정 권한이 유효하지 않습니다.\n다시 로그인을 해주세요.");
	}
}
