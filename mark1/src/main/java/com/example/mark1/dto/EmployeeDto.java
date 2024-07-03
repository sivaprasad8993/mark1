package com.example.mark1.dto;

import com.example.mark1.enums.DepartmentType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.antlr.v4.runtime.misc.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDto extends Output{

    public EmployeeDto(){

    }
    public EmployeeDto(Long id, String name, DepartmentType department) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public EmployeeDto(String success,String message){
        super(success,message);
    }


    private Long id;
    @NotBlank(message = "Name should not be blank")
    private String name;
    private DepartmentType department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentType getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentType department) {
        this.department = department;
    }
}
