package com.chen.realm;

import com.chen.constant.Constant;
import com.chen.entity.User;
import com.chen.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

/**
 * @author Carl
 * @title: Myrealm
 * @description: 自定义的验证规则
 * @date 2019/8/26 19:16
 */
public class Myrealm extends AuthorizingRealm {
    @Resource
    private UserService userService;


    /**
     * 授权
     * @param principalCollection 
     * @return 授权信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户名
        User user = (User) principalCollection.getPrimaryPrincipal();
        //更加用户id查询所有的用户权限
        return null;
    }

    /**
     * 认证
     *
     * @param authenticationToken  认证凭证
     * @return 验证的凭证信息
     * @throws AuthenticationException 认证的错误异常
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String principal = (String) authenticationToken.getPrincipal();
        //查询密码
        User user = null;
        try {
            user = userService.selectByUsername(principal);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AuthenticationException();
        }
        if (user == null) {
            return null;
        } else {
            ByteSource source = ByteSource.Util.bytes(Constant.SALT);
            return new SimpleAuthenticationInfo(user,
                    user.getPassword(),source,this.getName());

        }
    }
}
