package com.sec.erp.domain.repository;


import com.sec.erp.domain.modle.Resource;

import java.util.List;


public interface ResourceRepository {

    void add(Resource resource);

    void update(Resource resource);

    Resource get(String code);

    List<Resource> list();

    void remove(String code);

    void switchStatus(String code, boolean disabled);

    List<Resource> listByRole(String roleId);

    List<Resource> getEnableResources();

}
