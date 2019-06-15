package kr.hs.dgsw.board_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {
    private Long id;
    private Long user_id;
    private String title;
    private String content;
    private LocalDateTime created;
    private LocalDateTime updated;
}
