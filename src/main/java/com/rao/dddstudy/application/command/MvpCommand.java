package com.rao.dddstudy.application.command;

import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Date;

/**
 * @author create 2024/3/19 by rao
 */
@Data
public class MvpCommand implements Serializable {
    private String playerId;

    private Date mvpTime;

    public MvpCommand(String playerId, Date mvpTime) {
        Assert.notNull(playerId,"playerId 参数缺失");
        Assert.notNull(playerId,"mvpTime 参数缺失");

        this.playerId = playerId;
        this.mvpTime = mvpTime;
    }
}
