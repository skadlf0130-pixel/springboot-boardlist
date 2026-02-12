package com.green.boardauth.application.board;

import com.green.boardauth.application.board.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;
    public long postBoard(BoardPostReq req) {
       boardMapper.save(req);
       return req.getId();
    }
    public List<BoardGetRes> getBoardList(BoardGetReq req){
        return boardMapper.findAll(req);
    }
    public int getBoardMaxPage(BoardGetMaxPageReq req){
        return boardMapper.findMaxPage(req);
    }
    public BoardGetListRes getBoard(long id){
        return boardMapper.findList(id);
    }
    public void putBoard(BoardPostPutReq req) {
        boardMapper.update(req);
    }
    public int delBoard(BoardDelReq req) {
        return boardMapper.deleteById(req);
    }
    public List<String > getBoardSearch(String searchText){
        return boardMapper.searchTitle(searchText);
    }
}
