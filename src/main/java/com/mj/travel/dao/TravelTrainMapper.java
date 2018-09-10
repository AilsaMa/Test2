package com.mj.travel.dao;

import com.mj.travel.entity.TravelTrain;
import java.util.List;

public interface TravelTrainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_train
     *
     * @mbg.generated Mon Sep 10 19:23:07 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_train
     *
     * @mbg.generated Mon Sep 10 19:23:07 CST 2018
     */
    int insert(TravelTrain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_train
     *
     * @mbg.generated Mon Sep 10 19:23:07 CST 2018
     */
    TravelTrain selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_train
     *
     * @mbg.generated Mon Sep 10 19:23:07 CST 2018
     */
    List<TravelTrain> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_train
     *
     * @mbg.generated Mon Sep 10 19:23:07 CST 2018
     */
    int updateByPrimaryKey(TravelTrain record);
}