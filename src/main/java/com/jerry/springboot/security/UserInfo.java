package com.jerry.springboot.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户信息
 * @、这里我写了几个较为常用的字段，id，name，username，password，可以根据实际的情况自己增加
 *
 */
public class UserInfo implements UserDetails {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	private Long id;

	/**
	 * 用户名称
	 */
	private String name;

	/**
	 * 登录名称
	 */
	private String username;

	/**
	 * 登录密码
	 */
	private String password;

	private boolean isAccountNonExpired = true;

	private boolean isAccountNonLocked = true;

	private boolean isCredentialsNonExpired = true;

	private boolean isEnabled = true;

	private Set<AuthorityInfo> authorities = new HashSet<>();

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return isEnabled;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	public void setAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public void setAuthorities(Set<AuthorityInfo> authorities) {
		this.authorities = authorities;
	}

}
