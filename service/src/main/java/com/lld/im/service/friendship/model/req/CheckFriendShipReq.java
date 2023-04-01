package com.lld.im.service.friendship.model.req;

import com.lld.im.common.model.RequestBase;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @description:
 * @author: lld
 * @version: 1.0
 */
@Data
public class CheckFriendShipReq extends RequestBase {

    @NotBlank(message = "fromId can't be empty")
    private String fromId;

    @NotEmpty(message = "toIds can't be empty")
    private List<String> toIds;

    @NotNull(message = "checkType can't be empty")
    private Integer checkType;
}
