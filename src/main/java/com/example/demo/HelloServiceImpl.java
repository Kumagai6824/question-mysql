package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {

    private HelloMapper helloMapper;

    public HelloServiceImpl(HelloMapper helloMapper) {
        this.helloMapper = helloMapper;
    }

    @Override
    public List<HelloEntity> findAll() {
        return helloMapper.findAll();
    }

}
