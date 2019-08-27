package com.chen.config;

import com.chen.realm.Myrealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Carl
 * @title: ShiroConfig
 * @description: shiro配置类
 * @date 2019/8/26 19:34
 */
@Configuration
public class ShiroConfig {
    @Bean
    public Myrealm myrealm(){
        Myrealm myrealm = new Myrealm();
        myrealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return myrealm;
    }
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        hashedCredentialsMatcher.setHashIterations(1024);
        return hashedCredentialsMatcher;
    }
    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myrealm());
        return securityManager;
    }
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean() {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setLoginUrl("/page/login");
        Map<String,String> pathMap = new LinkedHashMap<>();
        pathMap.put("/static/**","anon");
        pathMap.put("/page/login","anon");
        pathMap.put("/user/login","anon");
        pathMap.put("/**","authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(pathMap);
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        return shiroFilterFactoryBean;
    }
}
