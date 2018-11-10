package com.ben.abcdemo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ben.abcdemo.bean.dto.ResponseBean;
import com.ben.abcdemo.entity.UserInfo;
import com.ben.abcdemo.service.UserInfoService;

/**
 * 用户Controller
 *
 */
@RestController
public class UserInfoController {

	private final static Logger logger = LoggerFactory.getLogger(UserInfoController.class);

	@Autowired
	private UserInfoService userInfoService;

	/**
	 * 模块名称，用于记录日志
	 */
	private String menuName = "用户";

	/**
	 * 查询
	 * 
	 * @param paramBean
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/v1/findUserInfoList")
	public ResponseBean r_userInfo_list(UserInfo paramBean) 
	{
		try 
		{
			List<UserInfo> dataList = userInfoService.findAllUserInfo();
			return new ResponseBean().success(dataList);
		} 
		catch (Exception e) 
		{
			logger.error(menuName + "，查询列表，异常。", e);
			return new ResponseBean().failure();
		}
	}
}