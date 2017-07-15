package cn.mejhwu.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/15/17
 * Time:   2:37 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int a = 0;
        return "index";
    }

    @RequestMapping("/index")
    public String index2() {
        System.out.println("bbbbbbbbbbbbbbbbbbbbb");
        int b = 1;
        return "index";
    }

}
