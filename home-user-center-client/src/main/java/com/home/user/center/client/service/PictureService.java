package com.home.user.center.client.service;

import com.home.user.center.client.vo.PictureParam;
import com.home.user.center.client.vo.PictureResult;

import java.util.List;

/**
 * Created by wuzebo1 on 2016/5/29.
 */
public interface PictureService {
    Integer insertPicture(PictureParam pictureParam);
    Integer deletePicture(PictureParam pictureParam);
    Integer updatePicture(PictureParam pictureParam);
    PictureResult getPictureById(Long id);
    List<PictureResult> getPictureByUserId(Long userId);
}
