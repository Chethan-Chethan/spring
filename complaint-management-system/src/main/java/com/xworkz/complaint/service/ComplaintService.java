package com.xworkz.complaint.service;

import com.xworkz.complaint.entity.UserInfoEntity;

import java.util.List;

public interface ComplaintService {

    UserInfoEntity validateAndSaveUserInfo(UserInfoEntity entity);
    List<UserInfoEntity> validateAndFetchAllDetails();
    boolean validateAndDeleteUserInfoById(int userId);
    UserInfoEntity validateAndFetchById(int userId);
    UserInfoEntity validateAndUpdateById(UserInfoEntity entity);



}
