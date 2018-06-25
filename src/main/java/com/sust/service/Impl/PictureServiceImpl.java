package com.sust.service.Impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sust.dao.PicPictureMapper;
import com.sust.entity.PicPicture;
import com.sust.entity.PicPictureExample;
import com.sust.entity.PicPictureExample.Criteria;
import com.sust.service.PictureService;

@Service
public class PictureServiceImpl implements PictureService {

	//private static final Log logger = LogFactory.getLog(PictureServiceImpl.class);
	@Resource
	private PicPictureMapper picPictureMapper;
	
	@Override
	public List<PicPicture> getAllPicInfo() {

		PicPictureExample example = new PicPictureExample();
		example.setOrderByClause("pi_uptime asc");
		return picPictureMapper.selectByExample(example);
	}

	@Override
	public List<PicPicture> getUserPicInfo(Integer id) {
		
		PicPictureExample example = new PicPictureExample();
		Criteria criteria = example.createCriteria();
        criteria.andUsIdEqualTo(id);
        example.setOrderByClause("pi_uptime asc");
		return  picPictureMapper.selectByExample(example);
	}

	@Override
	public void addInfo(Integer  id,String originalFilename) {
		PicPicture picPicture = new PicPicture();
		picPicture.setUsId(id);
		picPicture.setPiTitle("毕业快乐");
		picPicture.setPiUptime(new Date());
		picPicture.setPiStr1(originalFilename);
		
		picPictureMapper.insert(picPicture);
	}
	
	
}
