package com.deyiwangxing.dywxFM;

import com.deyiwangxing.dywxFM.dao.UserInfoMapper;
import com.deyiwangxing.dywxFM.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author softtwilight
 * @vesion create on 2019/1/19
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoMapperTest {

    @Autowired
    private UserInfoMapper mapper;

    @Test
    public void testGet() {
        UserInfo userInfo = mapper.selectById(1);
        System.out.println(userInfo);
    }
}
