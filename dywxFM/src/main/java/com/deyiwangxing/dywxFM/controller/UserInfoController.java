package com.deyiwangxing.dywxFM.controller;

import com.deyiwangxing.dywxFM.core.response.ResultVO;
import com.deyiwangxing.dywxFM.service.UserInfoService;
import com.deyiwangxing.dywxFM.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author softtwilight
 * @vesion create on 2019/1/20
 */

@RestController
@RequestMapping("user")
public class UserInfoController {


    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/hello")
    public ResultVO sayHello() {
        return CommonUtils.success("Hello DYWX");
    }

    @GetMapping("/{id}")
    public ResultVO selectById(@PathVariable Integer id) {

        return CommonUtils.success(userInfoService.selectById(id));
    }

}
