package com.home.user.center.web;

import com.home.user.center.client.service.PictureService;
import com.home.user.center.client.vo.PictureParam;
import com.home.user.center.client.vo.PictureResult;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wuzebo1 on 2016/5/29.
 */
public class PictureDaoImplTest extends BaseTest {
    @Resource
    private PictureService pictureService;

    @Test
    public void insertPicture(){
        PictureParam pictureParam = new PictureParam();
        pictureParam.setUserId(5l);
        pictureParam.setPicStatus(1);
        pictureParam.setPicType(1);

        pictureService.insertPicture(pictureParam);
    }
    @Test
    public void  deletePicture(){
        PictureParam pictureParam = new PictureParam();
        pictureParam.setId(1l);
        pictureService.deletePicture(pictureParam);

    }
    @Test
    public void  updatePicture(){
        PictureParam pictureParam = new PictureParam();
        pictureParam.setId(1l);
        pictureParam.setSortNumber(1);
        pictureService.updatePicture(pictureParam);
    }
    @Test
    public void getPictureById(){
        Long id = 1l;
        PictureResult pictureResult = pictureService.getPictureById(id);
        System.out.print(pictureResult);
    }
    @Test
    public void  getPictureByUserId(){
        Long userId = 5l;
        List<PictureResult> pictureResults = pictureService.getPictureByUserId(userId);
        System.out.print(pictureResults);
    }
}
