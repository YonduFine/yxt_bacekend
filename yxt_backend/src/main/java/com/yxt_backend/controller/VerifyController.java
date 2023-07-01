package com.yxt_backend.controller;

import com.yxt_backend.common.YxtCommon;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * <p>please description this Class usage</p>
 *
 */
@RestController
@RequestMapping("/api")
public class VerifyController {

    @GetMapping("/verify")
    public String verify(@PathParam("code") String code){
        String res = "{\"code\":0,\"data\":{\"nickName\":\"tUYb\",\"time\":31076591759,\"type\":0},\"msg\":\"授权成功\"}";
        return res;
    }

    @GetMapping("/saveConfig")
    public String saveConfig(){
        return "{\"code\":0,\"msg\":\"更新成功\"}";
    }


    @GetMapping("/getWords")
    public String getWords(){
        return "{\"code\":-1,\"msg\":\"暂无数据\"}";
    }


    @GetMapping("/updateVersion")
    public String updateVersion(){
        return "{\"code\":-1,\"msg\":\"没有最新版本\"}";
    }

    @GetMapping("/getCases")
    public String getCases(){
        return YxtCommon.CASES;
    }

    @GetMapping("/getNodeVersion")
    public String getNodeVersion(@RequestParam(value = "packageName") String packageName,
                                 @RequestParam(value = "version")String version,
                                 @RequestParam(value = "code")String code){
        return YxtCommon.NODE_VERSION;
    }
}
