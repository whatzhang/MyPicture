package com.sust.service;

import java.util.List;

import com.sust.entity.PicPicture;

public interface PictureService {

	List<PicPicture> getAllPicInfo();

	List<PicPicture> getUserPicInfo(Integer id);

	void addInfo(Integer  id,String originalFilename);

}
