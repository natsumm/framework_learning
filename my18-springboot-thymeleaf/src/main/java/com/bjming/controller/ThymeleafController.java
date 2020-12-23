package com.bjming.controller;

import com.bjming.vo.SysUser.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class ThymeleafController {

    @GetMapping("/expression1")
    public String expression1(Model model) {
        System.out.println("expression1接收到请求");
        /*request.setAttribute("name", "张三");
        request.setAttribute("sex", "m");
        request.setAttribute("age", 19);*/

        model.addAttribute("name", "张三");
        model.addAttribute("sex", "m");
        model.addAttribute("age", 19);
        return "01-expression";
    }

    @GetMapping("/expression2")
    public ModelAndView expression2() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("sysUser", new SysUser("王武", 17, "m"));
        mv.addObject("date", new Date());
        mv.setViewName("02-expression");
        return mv;
    }

    @GetMapping("/linkExpression")
    public String linkExpression(Model model) {
        model.addAttribute("myWebsite1", "http://www.bjming.com");
        model.addAttribute("myWebsite2", "/bjming");
        model.addAttribute("myWebsite3", "biming");
        return "03-linkExpression";
    }

    @RequestMapping("/htmlProperty")
    public String htmlProperty(Model model) {
        model.addAttribute("data", new SysUser("王武", 17, "m").toString());
        return "04-htmlProperty";
    }

    @GetMapping("/eachList")
    public String eachList(Model model) {
        List<String> strList = new ArrayList<>();
        strList.add("张三");
        strList.add("Natsu");
        strList.add("Yuki");
        model.addAttribute("strList", strList);

        //添加对象数组
        List<SysUser> userList = new ArrayList<>();
        userList.add(new SysUser("张勇", 18, "m"));
        userList.add(new SysUser("王菲", 25, "f"));
        userList.add(new SysUser("厉声", 18, "m"));
        model.addAttribute("userList", userList);
        return "05-eachList";
    }

    @RequestMapping("/eachArray")
    public String eachArray(Model model) {
        SysUser[] userArray = new SysUser[5];
        userArray[0] = new SysUser("张勇", 18, "m");
        userArray[1] = new SysUser("王章", 18, "m");
        userArray[2] = new SysUser("成飞", 25, "m");
        userArray[3] = new SysUser("李嘉熙", 23, "f");
        userArray[4] = new SysUser("张梓琳", 14, "f");
        model.addAttribute("userArray", userArray);
        return "06-eachArray";
    }

    @GetMapping("/eachMap")
    public String eachMap(Model model) {
        Map<String, SysUser> userMap = new HashMap<>();
        userMap.put("1001", new SysUser("张勇", 18, "m"));
        userMap.put("1002", new SysUser("王章", 18, "m"));
        userMap.put("1003", new SysUser("成飞", 25, "m"));
        userMap.put("1004", new SysUser("李嘉熙", 23, "f"));
        userMap.put("1005", new SysUser("张梓琳", 14, "f"));
        //注意放到集合中的对象, 如果存放的是对象, 则保存的是对象的内存地址,
        //对对象的内容进行修改, 也会影响到集合中存放的对象
        model.addAttribute("userMap", userMap);

        List<Map<String, SysUser>> mapList = new ArrayList<>();
        Map<String, SysUser> userMap2 = new HashMap<>();
        userMap2.put("1011", new SysUser("张飞", 24, "m"));
        userMap2.put("1022", new SysUser("关羽", 25, "m"));
        userMap2.put("1033", new SysUser("刘备", 28, "m"));
        userMap2.put("1044", new SysUser("李嘉熙", 23, "f"));
        userMap2.put("1055", new SysUser("张梓琳", 14, "f"));
        mapList.add(userMap);
        mapList.add(userMap2);
        //添加一个List<Map<String, SysUser>
        model.addAttribute("mapList", mapList);
        return "07-eachMap";
    }

    @GetMapping("/ifUnless")
    public String ifUnless(Model model) {
        model.addAttribute("isLogin", true);
        model.addAttribute("吃了吗", "yes");
        //-减号在模板中属于特殊运算符
        //model.addAttribute("firewalld-status", "dead");
        model.addAttribute("firewalld_status", "dead");

        model.addAttribute("age", 20);

        //注意空字符串表示true
        model.addAttribute("name", "");
        return "08-ifUnless";
    }

    @RequestMapping("/switchCase")
    public String switchCase(Model model) {
        model.addAttribute("name", "张三");
        model.addAttribute("sex", "0");
        return "09-switchcase";
    }

    @GetMapping("/inline")
    public ModelAndView inline() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "张三");
        mv.addObject("isLogin", true);
        mv.addObject("user", new SysUser("张明", 15, "m"));
        mv.setViewName("10-inline");
        return mv;
    }
}
