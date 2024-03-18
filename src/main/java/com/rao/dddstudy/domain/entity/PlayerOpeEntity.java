package com.rao.dddstudy.domain.entity;

import com.rao.dddstudy.domain.dp.EntityId;
import com.rao.dddstudy.infrastructure.datamodel.PlayerOpe;
import lombok.Data;

import java.util.Date;

/**
 * 玩家运营数据
 */
@Data
public class PlayerOpeEntity{

    /**
     * 实体 ID
     */
    private EntityId entityId;

    /**
     * 玩家ID
     */
    private String playerId;

    /**
     * 首次获得MVP时间，默认是9999-12-31 23:59:59
     */
    private Date firstMvpTime;

    /**
     * 累计跟几个妹子组过CP
     */
    private Integer cpCount;

    /**
     * 上一个CP的玩家ID，相同的话不累加
     */
    private String lastCpPlayerId;


    public void handleCpCount(String cpPlayerId) {
        //没组过CP，要初始化
        if (cpCount == null || cpCount == 0) {
            this.setCpCount(1);
            this.setLastCpPlayerId(cpPlayerId);
        } else {
            //组过CP的话，需要这次新CP的玩家ID跟上次的不一样才会统计
            //小两口闹矛盾又复合的就别记录进去了
            if (!cpPlayerId.equals(this.getLastCpPlayerId())) {
                this.setCpCount(this.getCpCount() + 1);
                this.setLastCpPlayerId(cpPlayerId);
            }
        }
    }

    public void handleMvp(Date mvpTime) {
        if (firstMvpTime == null) {
            this.setFirstMvpTime(mvpTime);
        } else {
            Date firstMvpTime = this.getFirstMvpTime();
            //判断时间是否在默认时间之前
            if (mvpTime.before(firstMvpTime)) {
                this.setFirstMvpTime(mvpTime);
            }
        }
    }
}
