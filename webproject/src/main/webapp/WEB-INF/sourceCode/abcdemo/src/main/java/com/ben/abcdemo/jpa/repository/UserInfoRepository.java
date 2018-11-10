package com.ben.abcdemo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ben.abcdemo.entity.UserInfo;

/**
 *	用户JpaRepository
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {

}