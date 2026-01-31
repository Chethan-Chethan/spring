package com.xworkz.complaint.repository;

import com.xworkz.complaint.entity.UserInfoEntity;

import java.util.List;

public interface ComplaintRepository {

    UserInfoEntity saveUserInfo(UserInfoEntity entity);
    List<UserInfoEntity> fetchAllDetails();
    boolean deleteUserInfoById(int userId);
    UserInfoEntity fetchById(int userId);
    UserInfoEntity updateById(UserInfoEntity entity);
}
