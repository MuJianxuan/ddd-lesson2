package com.rao.dddstudy.domain.dp;

import lombok.Getter;
import org.springframework.util.Assert;

/**
 * @author create 2024/3/18 by rao
 */
@Getter
public class EntityId {

    private final Long value;

    public EntityId(Long value) {
        Assert.notNull(value,"值不能为 null");
        this.value = value;
    }
}
