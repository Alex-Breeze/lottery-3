package com.github.chengbin.admin.vo;

import com.github.chengbin.admin.entity.User;

import java.util.List;

/**
 * Created by Ace on 2017/6/18.
 */
public class GroupUsers {
    List<User> members ;
    List<User> leaders;

    public GroupUsers() {
    }

    public GroupUsers(List<User> members, List<User> leaders) {
        this.members = members;
        this.leaders = leaders;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<User> getLeaders() {
        return leaders;
    }

    public void setLeaders(List<User> leaders) {
        this.leaders = leaders;
    }
}