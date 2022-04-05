package com.sangin.admin.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sangin.board.mapper.BoardMapper;
import com.sangin.board.vo.BoardVO;

@Service
public class AdminService {
	
	@Inject
	private BoardMapper mapper;
	
	public List<BoardVO> list (){
		return mapper.list();
	}

	public Object view(Long clothNum) {
		// TODO Auto-generated method stub
		return mapper.view(clothNum);
	}

	public int delete(Long clothNum) {
		return (int) mapper.delete(clothNum);
	}


}
