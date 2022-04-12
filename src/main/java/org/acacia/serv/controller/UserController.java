package org.acacia.serv.controller;

import com.baomidou.mybatisplus.extension.api.R;
import org.acacia.serv.entity.UserEntity;
import org.acacia.serv.entity.vo.UserVo;
import org.acacia.serv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNullApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/page")
    public R<List<UserEntity>> page () {
        return R.ok(userService.page());
    }

    @GetMapping("/detail/{id}")
    public R<UserVo> detail(@PathVariable(value = "id") Integer id){
        return R.ok(userService.detail(id));
    }
}
