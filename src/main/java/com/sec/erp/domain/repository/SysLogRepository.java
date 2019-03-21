package com.sec.erp.domain.repository;


import com.sec.erp.domain.modle.SysLog;

import java.util.List;

public interface SysLogRepository {

    void add(SysLog sysLog);

    List<SysLog> list();

    void clear();
}
