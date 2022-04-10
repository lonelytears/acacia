package org.acacia.serv.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.acacia.serv.entity.UserEntity;
import org.acacia.serv.entity.vo.UserVo;

import java.util.List;

public interface UserService extends IService<UserEntity> {
    public List<UserEntity> page();
}
