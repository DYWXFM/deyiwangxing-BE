package com.deyiwangxing.dywxFM.controller;

import com.deyiwangxing.dywxFM.core.response.ResultVO;
import com.deyiwangxing.dywxFM.service.UserInfoService;
import com.deyiwangxing.dywxFM.utils.CommonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author softtwilight
 * @vesion create on 2019/1/20
 */

@RestController
@RequestMapping("user")
@Api(tags = {"测试接口"}, description = "userInfoControler")
public class UserInfoController {


    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/hello")
    public ResultVO sayHello() {
        Map<String, String> map = new HashMap<>();
        map.put("name", null);
        return CommonUtils.success(map);
    }


    @ApiOperation(value = "查询用户", notes = "根据用户id查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true,
                    dataType = "Integer", paramType = "path")
    })
    @GetMapping("/{id}")
    public ResultVO selectById(@PathVariable Integer id) {

        return CommonUtils.success(userInfoService.selectById(id));
    }

}
