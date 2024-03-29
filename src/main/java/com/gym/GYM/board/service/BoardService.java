package com.gym.GYM.board.service;



import java.io.IOException;

import org.springframework.web.servlet.ModelAndView;

import com.gym.GYM.board.dto.BoardDTO;



public interface BoardService {

	ModelAndView boardList();

	ModelAndView boardRegist(BoardDTO board) throws IllegalStateException, IOException;

	ModelAndView boardView(int boardNo);

	ModelAndView boardModifyForm(int boardNo);

	ModelAndView boardModify(BoardDTO board) throws IllegalStateException, IOException;

    ModelAndView boardDelete(int boardNo);

    ModelAndView boardCSList(String boardWriter);

    ModelAndView boardCSRegist(BoardDTO board);


	ModelAndView boardCSDelete(BoardDTO board);

	ModelAndView boardCSView(int boardNo);

    ModelAndView boardCSAdminList();
}
