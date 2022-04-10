package org.acacia.serv.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("user")
public class UserEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String userName;

    private String tel;

    private String email;

    private String passWord;

    private Integer ifDeleted;

    private Integer status;

    @TableField(fill = FieldFill.INSERT)
    private Integer createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Integer updateTime;

}
