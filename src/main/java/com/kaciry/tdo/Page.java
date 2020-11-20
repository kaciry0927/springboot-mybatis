package com.kaciry.tdo;

import com.kaciry.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author kaciry
 * @date 2020/11/20 10:13
 * @description
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Page {
    private int current = 1;

    private User user;

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public void setUser(User user) {
        this.user = user;
    }
}
