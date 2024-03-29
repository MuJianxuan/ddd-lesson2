package com.rao.dddstudy.domain.dp;

import lombok.Data;
import org.springframework.util.Assert;

/**
 * @author create 2024/3/28 by rao
 */
@Data
public class PlayerId {
    private final String value;

    public PlayerId(String value) {
        Assert.notNull(value,"不能为 null");
        this.value = value;
    }
}
