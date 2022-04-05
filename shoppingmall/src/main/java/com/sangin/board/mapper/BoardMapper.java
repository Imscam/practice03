package com.sangin.board.mapper;

import java.util.List;

import com.sangin.board.vo.BoardVO;

public interface BoardMapper {
	
	//상품 목록
	public List<BoardVO> list();
	
	//상품 조회
	public Object view(Long clothNum);
	
	//상품 삭제
	public int delete(Long clothNum);
}
