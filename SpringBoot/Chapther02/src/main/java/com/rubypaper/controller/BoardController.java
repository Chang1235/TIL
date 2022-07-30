package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;

@RestController
public class BoardController {
	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
	
	@RequestMapping("/hello.do")
	public String hello(String name) {
		return "Hello : :" + name;
	}
	
	@RequestMapping("/getBoard.do")
	//객체를 바로 출력할 수 없다.
	// 그래서 JSON으로 변환해서 출력해준다. ( xml은 무겁기 때문에)
	public BoardVO getBoard() {
		BoardVO board = new BoardVO();
		board.setSeq(1);
		board.setTitle("테스트 제목...");
		board.setWriter("테스터");
		board.setContent("테스트 내용");
		board.setCreateDate(new Date());
		board.setCnt(0);
		return board;
	}
	
	@RequestMapping("/getBoardList.do")
	public List<BoardVO> getBoardList() {
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		for (int i = 1; i < 10; i++) {
			BoardVO board = new BoardVO();
			board.setSeq(i);
			board.setTitle("테스트 제목...");
			board.setWriter("테스터");
			board.setContent("테스트 내용");
			board.setCreateDate(new Date());
			board.setCnt(0);
			
			boardList.add(board);
		}
		return boardList;
	}
}
