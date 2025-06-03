package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition
public @interface EmployeeConfiguration {
    @AttributeDefinition
            (name = "EmployeeName",
            description = "Aanan is an employee",
                    required = true,
                    defaultValue = "Aanan"
            )
    public String name();
    @AttributeDefinition
            (name = "Employeeid",
                    description = "Employee id",
                    required = true,
                    defaultValue = "9999"
            )
    public int id();
    @AttributeDefinition
            (name = "Employeesalary",
                    description = "Employee salary",
                    required = true,
                    defaultValue = "50000"
            )
    public double salary();
}
