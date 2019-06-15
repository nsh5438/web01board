package kr.hs.dgsw.board_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PostMapper {

    List<Post> findAllPost();
    int deleteBypostId(Long id);

    Long addPost(Post post);
    int modifyPost(Post post);
    Post findBypostId(Long id);
    List<Post> findByUserId(Long userid);
    Long addMultiHashMap(HashMap<String, Object> map);

}
