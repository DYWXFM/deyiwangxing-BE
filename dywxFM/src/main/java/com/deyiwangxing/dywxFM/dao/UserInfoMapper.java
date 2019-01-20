package com.deyiwangxing.dywxFM.dao;

import com.deyiwangxing.dywxFM.model.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @author softtwilight
 * @vesion create on 2019/1/19
 */

@Repository
public interface UserInfoMapper {

    UserInfo selectById(Integer id);


}
