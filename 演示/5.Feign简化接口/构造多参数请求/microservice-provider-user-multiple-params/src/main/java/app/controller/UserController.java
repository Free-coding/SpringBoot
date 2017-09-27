package app.controller;

import app.entity.User;
import app.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 吴文韬 on 2017/9/26.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User findOne=this.userRepository.findOne(id);
        return findOne;
    }

    @GetMapping("/user/get1")
    public User get1(User user){
        return user;
    }

    @GetMapping("/user/get2")
    public User get2(User user){
        return user;
    }

    @PostMapping("/user/post")
    public User post(@RequestBody User user){
        return user;
    }
}
