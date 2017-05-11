package com.home.user.center.dao.impl;

import com.home.user.center.dao.PictureDao;
import com.home.user.center.domain.Picture;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wuzebo1 on 2016/5/29.
 */
@Repository
public class PictureDaoImpl extends BaseDaoImpl<Picture, Long> implements PictureDao {
    private final static String NAMESPACE = "com.home.user.center.dao.PictureDao.";
    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE+statement;
    }


}
