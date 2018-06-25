package com.sust.service.Impl;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.sust.dao.PicUsersMapper;
import com.sust.entity.PicUsers;
import com.sust.entity.PicUsersExample;
import com.sust.entity.PicUsersExample.Criteria;
import com.sust.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	private static final Log logger = LogFactory.getLog(LoginServiceImpl.class);
	@Resource
	private PicUsersMapper picUsersMapper;

	@Override
	public boolean judge(String name) {

		logger.info(name);
		PicUsersExample example = new PicUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsNameEqualTo(name);
		int count = picUsersMapper.countByExample(example);
		if (count < 1) {
			PicUsers pn = new PicUsers();
			pn.setUsName(name);
			picUsersMapper.insert(pn);
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int reg(String name) {

		logger.info("reg++"+name);
		PicUsers pn = new PicUsers();
		pn.setUsName(name);
		picUsersMapper.insert(pn);
		return picUsersMapper.selectUsidByName(name);

	}
	@Override
	public int getId(String name) {

		logger.info("getId++"+name);
		return picUsersMapper.selectUsidByName(name);

	}
}
