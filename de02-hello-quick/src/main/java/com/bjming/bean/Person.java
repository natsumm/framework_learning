package com.bjming.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中每一个属性的值, 都映射到这个组件中;
 *
 * @ConfigurationProperties: 告知springBoot将本类中的所有属性和配置文件中相关的配置进行绑定
 * prefix="per" ; 配置文件中的哪个属性进行映射
 * 属性注入时, 默认会按照set方法来进行注入,
 * 如果yml配置文件中的属性名与 set方法名的去掉set然后变为首字母小写部分不同, 就会注入失败;
 * 这里属性注入时, isMan属性注入失败
 * idea默认生成的set方法为 setMan(), 配置文件中的属性名为 isMan ,所以注入失败
 * <p>
 * 注意: 只有当这个组件是容器中的组件, 才能使用容器提供的功能@ConfigurationProperties功能;
 * 需要将其注入到容器中
 * @ConfigurationProperties(prefix = "person"): 默认从全局配置文件中获取值
 * Author: AshenOne
 * Time: 12/03/2020 10:33
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component
@Validated
@ConfigurationProperties(prefix = "person")
public class Person {
    //@Value("${person.name}")
    private String name;
    //@Value("#{15*20}")
    private Integer age;
    //@Value("true")
    private Boolean isMan;
    //@Email
    private Date birth;
    private Double height;
    private Map<String, Object> map;
    private Phone phone;
    private List<Object> list;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                ", birth=" + birth +
                ", height=" + height +
                ", map=" + map +
                ", phone=" + phone +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /* public Boolean getMan() {
         return isMan;
     }

     public void setMan(Boolean man) {
         isMan = man;
     }*/
    public Boolean getIsMan() {
        return isMan;
    }

    public void setIsMan(Boolean man) {
        isMan = man;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
}


