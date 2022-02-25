package com.blind.api.domain.board.v1.controller;

import com.blind.api.domain.board.v1.domain.Board;
import com.blind.api.domain.board.v1.dto.BoardRequestDTO;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

public interface BoardController {
    Board createBoard(@RequestBody @Valid BoardRequestDTO requestDTO, HttpServletRequest request);
    List<Board> findAllBoard();
}
