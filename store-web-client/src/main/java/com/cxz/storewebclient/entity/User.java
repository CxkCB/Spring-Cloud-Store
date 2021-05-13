package com.cxz.storewebclient.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {

//    用户ID
    @TableId(value = "user_id",type = IdType.AUTO)
    int userId;

//    用户手机号
    String userPhone;

//    用户邮箱
    String userEmail;

//    用户密码
    String userPassword;

//    用户昵称
    String userNickname;

//    用户头像
    String userIcon;

}
