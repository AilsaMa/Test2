package com.mj.travel.service;

import com.mj.travel.dao.TravelDestinationMapper;
import com.mj.travel.entity.TravelDestination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TravelDestinationMapper travelDestinationMapper;

    public TravelDestination test(){
        return travelDestinationMapper.selectByPrimaryKey("1");
    }

}


