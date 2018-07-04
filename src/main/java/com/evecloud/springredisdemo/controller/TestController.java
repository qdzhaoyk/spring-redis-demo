/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TestController
 * Author:   wfy
 * Date:     2018-07-04 14:59
 * Description: 测试控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.evecloud.springredisdemo.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试控制器〉
 *
 * @author wfy
 * @create 2018-07-04
 * @since 1.0.0
 */
@RestController
public class TestController {

    /**
     *
     * @param request
     * @return
     */
    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        return "hello" + request.getPathInfo();
    }
}
