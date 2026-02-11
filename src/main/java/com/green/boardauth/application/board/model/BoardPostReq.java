package com.green.boardauth.application.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardPostReq {
    private  long id; // 방금 insert한 row의 pk값을 담을 공간할당
    private String title;
    private String contents;
    private long userId;
}

