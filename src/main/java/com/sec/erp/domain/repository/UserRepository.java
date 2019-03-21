package com.sec.erp.domain.repository;

import com.sec.erp.domain.modle.User;

import java.util.List;

public interface UserRepository {

    void add(User user);

    void update(User user);

    void updateRoles(String uid, List<String> rids);

    User get(String id);

    boolean contains(String name);

    List<User> list();

    boolean hasResourcePermission(String userId, String resourceCode);

    void remove(String id);

    void switchStatus(String id, boolean disabled);

    User findByUserName(String username);

}
