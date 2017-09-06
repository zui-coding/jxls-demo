package com.zuicoding.platform.demo;

import com.zuicoding.platform.demo.domain.Employee;
import com.zuicoding.platform.demo.uitls.ExcelUitl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Stephen.lin on 2017/9/6.
 * <p>
 * Description :<p></p>
 */
public class Application {

    public static void main(String[] args) throws IOException {
        File file = new File("d:\\jxls-demo.xlsx");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);
        List<Employee> employees = new ArrayList<>(10);
        for (int i = 1 ; i <= 10 ; i++){
            employees.add(new Employee(i,"张三_"+i,i,"北京","1388XXXX"+i));
        }
        Map<String,Object> params = new HashMap<>();
        params.put("employees",employees);
        ExcelUitl.render("jxls-template.xlsx",params,fos);
    }
}
