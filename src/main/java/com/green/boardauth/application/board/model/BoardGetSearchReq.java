package com.green.boardauth.application.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class BoardGetSearchReq {
    private long id;
    private String title;
}
