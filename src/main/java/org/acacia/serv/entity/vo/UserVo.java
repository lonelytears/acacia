package org.acacia.serv.entity.vo;

import lombok.Data;
import java.io.Serializable;

@Data
public class UserVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userName;

    private String tel;

    private String email;

    private String passWord;

    private Integer ifDeleted;

    private Integer status;

    private Integer createTime;

    private Integer updateTime;
}
