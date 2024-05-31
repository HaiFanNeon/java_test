package com.haifan.exmple01;

import com.haifan.exmple01.mapper.EmpMapper;
import com.haifan.exmple01.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

//@MapperScan ("com.haifan.exmple01.mapper.EmpMapper")
@SpringBootTest
class Exmple01ApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete() {
        empMapper.delete(2);
    }

    @Test
    public void testInset() {
        Emp emp = new Emp();
        emp.setUsername("lisi1");
        emp.setName("李四1");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000, 1, 1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.insert(emp);
        System.out.println(emp.getId());
    }

    @Test
    public void testUpdate() {
        Emp emp = new Emp();
        emp.setId(1);
        emp.setUsername("HaiFan");
        emp.setName("海帆");


        empMapper.update(emp);
    }

    @Test
    public void testGetById() {
        Emp byId = empMapper.getById(18);
        System.out.println(byId);
    }

//    @Test
//    public void testList() {
//        List<Emp> list = empMapper.list("周", (short) 2, LocalDate.of(2010, 1, 1), LocalDate.of(2020, 1, 1));
//        list.stream().forEach(emp-> System.out.println(emp));
//    }
//    @Test
//    public void testList() {
//        List<Emp> list = empMapper.list("李", null, null, null);
//        list.stream().forEach(emp-> System.out.println(emp));
//    }
    @Test
    public void testList() {
        List<Emp> list = empMapper.list(null,null,null, null);
        list.stream().forEach(emp-> System.out.println(emp));
    }


    @Test
    public void testDeleteById() {
        List<Integer> ids = Arrays.asList(13, 14, 15, 16);

        empMapper.deleteByIds(ids);
    }
}
