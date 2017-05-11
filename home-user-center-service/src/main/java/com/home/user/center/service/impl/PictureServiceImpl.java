package com.home.user.center.service.impl;

import com.home.user.center.client.service.PictureService;
import com.home.user.center.client.vo.PictureParam;
import com.home.user.center.client.vo.PictureResult;
import com.home.user.center.dao.PictureDao;
import com.home.user.center.domain.Picture;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuzebo1 on 2016/5/29.
 */
@Service("pictureService")
public class PictureServiceImpl implements PictureService {

    @Resource
    private PictureDao pictureDao;

    @Override
    public Integer insertPicture(PictureParam pictureParam) {
        Picture picture = new Picture();
        if(pictureParam != null){
            BeanUtils.copyProperties(pictureParam, picture);
        }
        return pictureDao.insert(picture);
    }

    @Override
    public Integer deletePicture(PictureParam pictureParam) {
        Picture picture = new Picture();
        if(pictureParam != null){
            BeanUtils.copyProperties(pictureParam, picture);
        }
        return pictureDao.deleteById(picture.getId());
    }

    @Override
    public Integer updatePicture(PictureParam pictureParam) {
        Picture picture = new Picture();
        if(pictureParam != null){
            BeanUtils.copyProperties(pictureParam, picture);
        }
        return pictureDao.updateById(picture);
    }

    @Override
    public PictureResult getPictureById(Long id) {
        Picture picture = new Picture();
        picture.setId(id);
        Picture picture1 = pictureDao.selectOne(picture);
        PictureResult pictureResult = new PictureResult();
        if(picture1 != null){
            BeanUtils.copyProperties(picture1, pictureResult);
        }
        return pictureResult;
    }

    @Override
    public List<PictureResult> getPictureByUserId(Long userId) {
        Picture picture = new Picture();
        picture.setUserId(userId);
        List<Picture> list = pictureDao.selectList(picture);
        List<PictureResult> pictureResults = new ArrayList<PictureResult>();
        if(list != null && list.size() > 0){
            for(Picture p : list){
                PictureResult pictureResult = new PictureResult();
                BeanUtils.copyProperties(p, pictureResult);
                pictureResults.add(pictureResult);
            }
        }
        return pictureResults;
    }
}
