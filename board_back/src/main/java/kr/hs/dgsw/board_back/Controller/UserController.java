package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    public User login(@RequestBody User user) { return this.userService.login(user); }

    @GetMapping(value = "/list")
    public List users(){
        return this.userService.findAll();
    }

    @GetMapping(value = "/view/{id}")
    public User findById(@PathVariable Long id){
        return this.userService.findById(id);
    }

    @PostMapping(value = "/add")
    public Long add(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @DeleteMapping(value = "/delete/{id}")
    public int remove(@PathVariable Long id){
        return this.userService.deleteById(id);
    }

    @PutMapping(value = "/update")
    public int modify(@RequestBody User user) {
        return this.userService.modifyUser(user);
    }

}
