package com.mj.travel.entity;

import java.util.Date;

public class TravelCar {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.id
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.destination_id
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private String destinationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.origin
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private String origin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.terminus
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private String terminus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.distance
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private Double distance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.road_toll
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private Long roadToll;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.remark
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.create_user
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.update_user
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.create_time
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_car.update_time
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.id
     *
     * @return the value of travel_car.id
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.id
     *
     * @param id the value for travel_car.id
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.destination_id
     *
     * @return the value of travel_car.destination_id
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.destination_id
     *
     * @param destinationId the value for travel_car.destination_id
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.origin
     *
     * @return the value of travel_car.origin
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.origin
     *
     * @param origin the value for travel_car.origin
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.terminus
     *
     * @return the value of travel_car.terminus
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public String getTerminus() {
        return terminus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.terminus
     *
     * @param terminus the value for travel_car.terminus
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setTerminus(String terminus) {
        this.terminus = terminus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.distance
     *
     * @return the value of travel_car.distance
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.distance
     *
     * @param distance the value for travel_car.distance
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.road_toll
     *
     * @return the value of travel_car.road_toll
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public Long getRoadToll() {
        return roadToll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.road_toll
     *
     * @param roadToll the value for travel_car.road_toll
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setRoadToll(Long roadToll) {
        this.roadToll = roadToll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.remark
     *
     * @return the value of travel_car.remark
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.remark
     *
     * @param remark the value for travel_car.remark
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.create_user
     *
     * @return the value of travel_car.create_user
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.create_user
     *
     * @param createUser the value for travel_car.create_user
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.update_user
     *
     * @return the value of travel_car.update_user
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.update_user
     *
     * @param updateUser the value for travel_car.update_user
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.create_time
     *
     * @return the value of travel_car.create_time
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.create_time
     *
     * @param createTime the value for travel_car.create_time
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_car.update_time
     *
     * @return the value of travel_car.update_time
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_car.update_time
     *
     * @param updateTime the value for travel_car.update_time
     *
     * @mbg.generated Mon Sep 10 19:20:24 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}