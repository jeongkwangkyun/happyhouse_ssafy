package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.CommentDto;

public interface CommentService {
	List<CommentDto> list(int articleNo);
	boolean create(CommentDto commentDto);
	boolean modify(CommentDto commentDto);
	boolean delete(int commentNo);	
}
