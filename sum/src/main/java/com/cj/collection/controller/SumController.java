package com.cj.collection.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class SumController {

    @RequestMapping("sum")
    @ResponseBody
    public Map<String, String> sumInt(String a,String b){
        Map<String, String> map = new HashMap<>();
        if (StringUtils.isBlank(a) || StringUtils.isBlank(b)) {
            map.put("code", "400");
            map.put("msg", "参数不能为空");
        }else{
            if (isInteger(a) && isInteger(b)) {
                map.put("code", "200");
                map.put("msg", "计算成功");
                map.put("data", String.valueOf(Integer.parseInt(a) + Integer.parseInt(b)));
            }else{
                map.put("code", "300");
                map.put("msg", "请输入整数");
            }
        }
        return map;
    }

    @RequestMapping("oddAndEven")
    @ResponseBody
    public Map<String, String> oddAndEven(String sum){
        Map<String, String> map = new HashMap<>();
        if (StringUtils.isBlank(sum)) {
            map.put("code", "400");
            map.put("msg", "参数不能为空");
        }else{
            if (isInteger(sum)) {
                map.put("code", "200");
                map.put("msg", "计算成功");
                if (isEven(Integer.parseInt(sum))) {
                    map.put("data", "偶数");
                }else{
                    map.put("data", "奇数");
                }
            }else{
                map.put("code", "300");
                map.put("msg", "请输入整数");
            }
        }
        return map;
    }

    public boolean isInteger(String str) {
        return str.matches("^[-+]?\\d+$");
    }

    public boolean isEven(int number) {
        return (number & 1) == 0;
    }
}