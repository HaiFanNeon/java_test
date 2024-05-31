package com.example.exmple_test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer id; //ID
    private String name; //部门名称
    private LocalDateTime createTime; //创建时间
    private LocalDateTime updateTime; //修改时间
}

