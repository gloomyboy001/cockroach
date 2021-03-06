package com.zhangyingwei.cockroach.store;

import com.zhangyingwei.cockroach.executer.response.TaskResponse;

/**
 * Created by zhangyw on 2017/12/8.
 */
public class TestStore implements IStore {
    @Override
    public void store(TaskResponse response) throws Exception {
        System.out.println("hello store");
//        System.out.println(response.charset("gbk").getContent());
        response.charset("gbk").select("span").stream().forEach(element -> {
            System.out.println(element.text());
        });
    }
}
