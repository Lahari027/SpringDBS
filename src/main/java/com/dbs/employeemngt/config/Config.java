package com.dbs.employeemngt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//spring application related all objects which are commonly reqd 
//will be dcclared here
//w e will provide the base package name & it will help spring to
// create other objects for serv, repo etc
@Configuration
@ComponentScan(basePackages="com.dbs.employeemngt")
public class Config {

}
