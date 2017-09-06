package com.zuicoding.platform.demo.uitls;


import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/**
 * Created by Stephen.lin on 2017/9/6.
 * <p>
 * Description :<p>excel 生成工具类</p>
 */
public class ExcelUitl {

    private static String template_package = "template";

    private ExcelUitl(){}

    public static void render(String templateName, Map<String,Object> params, OutputStream os){
        try {
            InputStream is = ExcelUitl.class.getClassLoader().getResourceAsStream(template_package+"/"+templateName);
            Context context = new Context();
            if (params != null){
                for (Map.Entry<String, Object> entry : params.entrySet()) {
                    context.putVar(entry.getKey(),entry.getValue());
                }
            }

            JxlsHelper.getInstance().processTemplate( is,os,context);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
