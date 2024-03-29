package com.rao.dddstudy.application.command;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author create 2024/3/19 by rao
 */
@Data
public class MvpCommand implements Serializable {
    private String playerId;

    private Date mvpTime;
}
