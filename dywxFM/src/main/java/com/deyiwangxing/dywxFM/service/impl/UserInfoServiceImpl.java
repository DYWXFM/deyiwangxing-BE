package com.deyiwangxing.dywxFM.service.impl;

import com.deyiwangxing.dywxFM.dao.UserInfoMapper;
import com.deyiwangxing.dywxFM.model.UserInfo;
import com.deyiwangxing.dywxFM.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author softtwilight
 * @vesion create on 2019/1/20
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfo selectById(Integer id) {
        Objects.requireNonNull(id);
        return userInfoMapper.selectById(id);
    }
}
