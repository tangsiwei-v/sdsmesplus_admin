package com.uspring.sdsmesplus.service;

import java.awt.image.BufferedImage;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.uspring.sdsmesplus.entity.vo.USFile;

public interface FileService {

	USFile upFile(MultipartFile file);
	
	USFile upPdfFile(MultipartFile file);
	
	String downFile(HttpServletResponse response , String fileName);
	
	void DeleteFile(String filename);

	List<USFile> upFile(List<String> imgBase64String);
}
