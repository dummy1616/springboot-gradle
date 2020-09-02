package com.huyueyue.test.client.impl;

import com.huyueyue.test.client.UserClient;

import com.huyueyue.test.entity.Result;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl implements UserClient {

    @Override
    public Result hello(String id){
        return Result.error("调用失败，启动熔断机制");
    }
}
