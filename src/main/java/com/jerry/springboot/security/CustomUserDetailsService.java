package com.jerry.springboot.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.cas.authentication.CasAssertionAuthenticationToken;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 用于加载用户信息 实现UserDetailsService接口，或者实现AuthenticationUserDetailsService接口
 * 实现AuthenticationUserDetailsService，实现loadUserDetails方法
 */
public class CustomUserDetailsService implements AuthenticationUserDetailsService<CasAssertionAuthenticationToken> {

	@Override
	public UserDetails loadUserDetails(CasAssertionAuthenticationToken token) throws UsernameNotFoundException {
		System.out.println("当前的用户名是：" + token.getName());
		/*这里我为了方便，就直接返回一个用户信息，实际当中这里修改为查询数据库或者调用服务什么的来获取用户信息*/
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername("admin");
		userInfo.setName("admin");
		userInfo.setPassword("123456");
		Set<AuthorityInfo> authorities = new HashSet<>();
		AuthorityInfo authorityInfo = new AuthorityInfo("TEST");
		authorities.add(authorityInfo);
		userInfo.setAuthorities(authorities);
		return userInfo;
	}

}
