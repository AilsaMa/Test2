package com.mj.springcloudserver.service;

import com.mj.springcloudserver.dao.AcBankMapper;
import com.mj.springcloudserver.entity.AcBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private AcBankMapper acBankMapper;

    public AcBank getOneAcBank(){
        return acBankMapper.selectByPrimaryKey("1");
    }
}


