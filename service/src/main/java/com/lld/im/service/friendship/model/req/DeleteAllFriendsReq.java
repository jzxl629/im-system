package com.lld.im.service.friendship.model.req;

import com.lld.im.common.model.RequestBase;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class DeleteAllFriendsReq extends RequestBase {
    @NotBlank(message = "fromId can't be empty")
    private String fromId;
}
