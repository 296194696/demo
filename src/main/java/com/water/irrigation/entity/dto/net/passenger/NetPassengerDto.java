package com.water.irrigation.entity.dto.net.passenger;

import com.water.irrigation.entity.net.passenger.NetPassenger;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class NetPassengerDto extends NetPassenger {

    /**
     * 页数
     */
    private Integer pageno = 1;

    /**
     * 每页记录数
     */
    private Integer pagesize = 10;

    /**
     * 需要删除的数据列表
     */
    private List<NetPassenger> delLists;
}
