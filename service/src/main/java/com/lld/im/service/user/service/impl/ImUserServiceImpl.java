package com.lld.im.service.user.service.impl;

import com.lld.im.common.ResponseVO;
import com.lld.im.service.user.dao.mapper.ImUserDataMapper;
import com.lld.im.service.user.model.req.ImportUserReq;
import com.lld.im.service.user.model.resp.ImportUserResp;
import com.lld.im.service.user.service.ImUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImUserServiceImpl implements ImUserService {

    @Autowired
    ImUserDataMapper imUserDataMapper;

    @Override
    public ResponseVO importUser(ImportUserReq req) {
        if(req.getUserData().size() > 100) {
            //TODO too many return
        }

        List<String> successId = new ArrayList<>();
        List<String> errorId = new ArrayList<>();

        req.getUserData().forEach(e->{
            try {
                e.setAppId(req.getAppId());
                int insert = imUserDataMapper.insert(e);
                if(insert == 1) {
                    successId.add(e.getUserId());
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                errorId.add(e.getUserId());
            }
        });
        ImportUserResp resp = new ImportUserResp();
        resp.setErrorId(errorId);
        resp.setSuccessId(successId);
        return ResponseVO.successResponse(resp);
    }
}
