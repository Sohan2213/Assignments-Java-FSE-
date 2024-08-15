package com.example.employee.projection;

import org.springframework.beans.factory.annotation.Value;

public interface EmpProj {

    @Value("#{target.name + ' (' + target.email + ')'}")
    String getFullNameWithEmail();
}
