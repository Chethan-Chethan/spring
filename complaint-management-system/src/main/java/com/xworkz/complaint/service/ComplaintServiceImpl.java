package com.xworkz.complaint.service;

import com.xworkz.complaint.entity.UserInfoEntity;
import com.xworkz.complaint.repository.ComplaintRepository;
import com.xworkz.complaint.repository.ComplaintRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class ComplaintServiceImpl implements ComplaintService{

    ComplaintRepository repository = new ComplaintRepositoryImpl();
    @Override
    public UserInfoEntity validateAndSaveUserInfo(UserInfoEntity entity) {
        System.out.println("Invoking validation");
        UserInfoEntity isUserValid = null;


        if (entity!=null) {
            isUserValid = repository.saveUserInfo(entity);
        } else {
            isUserValid = null;
        }
        return isUserValid;
    }

    @Override
    public List<UserInfoEntity> validateAndFetchAllDetails() {
        System.out.println("Validating fetch method from service");

        List<UserInfoEntity> list = repository.fetchAllDetails();
        if (list!=null && !list.isEmpty()) {
            System.out.println("user entity found: " + list.isEmpty());
        }
        return list;
    }

    @Override
    public boolean validateAndDeleteUserInfoById(int userId) {
        System.out.println("validating delete from service");
        boolean isDel = false;

        if (userId>0) {
            isDel = repository.deleteUserInfoById(userId);
        } else {
            isDel = false;
        }
        return isDel;
    }

    @Override
    public UserInfoEntity validateAndFetchById(int userId) {
        System.out.println("validating fetch from service");
        UserInfoEntity isValidFetch = null;

        if (userId>0) {
            isValidFetch = repository.fetchById(userId);
        } else {
            System.out.println("Fetching failed");
        }
        return isValidFetch;
    }

    @Override
    public UserInfoEntity validateAndUpdateById(UserInfoEntity entity) {
        System.out.println("validate update from service");
        UserInfoEntity isValidUpdate = null;

        if (entity!=null) {
            isValidUpdate = repository.updateById(entity);
        } else {
            System.out.println("Update failed");
        }
        return isValidUpdate;
    }
}
