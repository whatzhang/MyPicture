package com.sust.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sust.entity.AllInfo;
import com.sust.service.PictureService;
import com.sust.service.WordService;

@Controller
@RequestMapping("/picture")
public class IndexController {

	private static final Log logger = LogFactory.getLog(LoginController.class);
	@Resource
	private PictureService pictureService;
	@Resource
	private WordService wordService;
	
	
	@RequestMapping(value = "/initData", method = RequestMethod.POST)
	public String init(HttpServletRequest request,HttpSession session,
			HttpServletResponse response, Model model) {
		Integer id = (Integer) session.getAttribute("UsId");
		logger.info("init++"+id);
		model.addAttribute("allPic",pictureService.getAllPicInfo());
		model.addAttribute("userPic",pictureService.getUserPicInfo(id));
		model.addAttribute("allTalk",wordService.getAllWordsInfo());
		
		return "index";
	}
	
	@RequestMapping("/uploadFileAjax")
	@ResponseBody
	public AllInfo uploadFileAjax(@RequestParam("upfile") CommonsMultipartFile file, HttpSession session) {

			String path = session.getServletContext().getRealPath("/images/pic")+File.separatorChar+file.getOriginalFilename();
			Integer uid = (Integer) session.getAttribute("UsId");
			logger.info("uploadFileAjax++" + file.getOriginalFilename() + "++" + path);
			pictureService.addInfo(uid,file.getOriginalFilename());
			File newFile = new File(path);
			try {
				file.transferTo(newFile);
			} catch (IllegalStateException | IOException e) {
				logger.error("uploadFileAjax_error");
			}
		return new AllInfo("success");
	}
}
