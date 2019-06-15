package kr.hs.dgsw.board_back.Service;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Domain.PostMapper;
import kr.hs.dgsw.board_back.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostMapper postMapper;
    @Override
    public List<Post> findAllPost() {
        return this.postMapper.findAllPost();
    }

    @Override
    public int deleteBypostId(Long id) {
        return this.postMapper.deleteBypostId(id);
    }

    @Override
    public Long addPost(Post post) {
        return this.postMapper.addPost(post);
    }

    @Override
    public int modifyPost(Post post) {
        return this.postMapper.modifyPost(post);
    }

    @Override
    public Post findBypostId(Long id) {
        return this.postMapper.findBypostId(id);
    }

    @Override
    public List<Post> findByUserId(Long userid) {
        return this.postMapper.findByUserId(userid);
    }

    @Override
    public Long addMultiHashMap(Post post) {
        HashMap map = new HashMap<String, Object>();
        map.put("userid",post.getId());
        map.put("title",post.getTitle());
        map.put("content",post.getTitle());
        return this.postMapper.addMultiHashMap(map);
    }
}
