package com.sangin.board.mapper;

import java.util.List;

import com.sangin.board.vo.BoardVO;

public interface BoardMapper {
	
	//��ǰ ���
	public List<BoardVO> list();
	
	//��ǰ ��ȸ
	public Object view(Long clothNum);
	
	//��ǰ ����
	public int delete(Long clothNum);
}
