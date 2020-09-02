package com.huyueyue.test.client;

import com.huyueyue.test.client.impl.UserClientImpl;

import com.huyueyue.test.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "user",fallback = UserClientImpl.class, path = "/user")
public interface UserClient {

    @RequestMapping(value = "/{id}")
    Result hello(@PathVariable("id") String id);

}
