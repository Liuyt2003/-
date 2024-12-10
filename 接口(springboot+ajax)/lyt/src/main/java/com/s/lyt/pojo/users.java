package com.s.lyt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value="users")
@Data
public class users {
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;

    private String username;
    private String password;
}
