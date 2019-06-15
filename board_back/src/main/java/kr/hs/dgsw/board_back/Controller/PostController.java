package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@CrossOrigin(origins = "*")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping(value = "/list")
    public List posts(){
        return this.postService.findAllPost();
    }

    @GetMapping(value = "/view/{id}")
    public Post findBypostId(@PathVariable Long id){
        return this.postService.findBypostId(id);
    }

    @GetMapping(value = "/userinlist/{userid}")
    public List<Post> findByUserId(@PathVariable Long userid){
        return this.postService.findByUserId(userid);
    }

    @DeleteMapping(value = "/delete/{id}")
    public int remove(@PathVariable Long id){
        return this.postService.deleteBypostId(id);
    }

    @PostMapping(value = "/add")
    public Long add(@RequestBody Post post){
        return this.postService.addPost(post);
    }

    @PutMapping(value = "/update")
    public int modify(@RequestBody Post post){
        return this.postService.modifyPost(post);
    }


}
