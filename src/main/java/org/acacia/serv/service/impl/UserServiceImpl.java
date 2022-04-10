package org.acacia.serv.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.acacia.serv.entity.UserEntity;
import org.acacia.serv.entity.vo.UserVo;
import org.acacia.serv.mapper.UserMapper;
import org.acacia.serv.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> page() {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("if_deleted", 0);
        //        BeanUtils.copyProperties(userEntity, );
        return userMapper.selectList(queryWrapper);
    }
}
