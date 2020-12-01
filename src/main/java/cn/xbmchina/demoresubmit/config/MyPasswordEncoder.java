package cn.xbmchina.demoresubmit.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author ：xbm
 * @date ：Created in 2020/12/1 17:53
 * @description：
 */
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return new BCryptPasswordEncoder().encode(charSequence.toString());
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return new BCryptPasswordEncoder().matches(charSequence,s);
    }
}