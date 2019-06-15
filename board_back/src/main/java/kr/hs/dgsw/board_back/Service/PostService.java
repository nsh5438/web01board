package kr.hs.dgsw.board_back.Service;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Domain.User;

import java.util.HashMap;
import java.util.List;

public interface PostService {

    List<Post> findAllPost();
    int deleteBypostId(Long id);

    Long addPost(Post post);
    int modifyPost(Post post);
    Post findBypostId(Long id);
    List<Post> findByUserId(Long userid);
    Long addMultiHashMap(Post post);
}
