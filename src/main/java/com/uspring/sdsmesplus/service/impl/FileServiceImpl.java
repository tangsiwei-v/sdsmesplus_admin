package com.uspring.sdsmesplus.service.impl;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.bouncycastle.util.encoders.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.uspring.sdsmesplus.common.UUIDUtil;
import com.uspring.sdsmesplus.entity.vo.USFile;
import com.uspring.sdsmesplus.service.FileService;


@Service
public class FileServiceImpl implements FileService {
	
	@Value("#{prop.image_up_load_file}")
	private String IMG_UPLOAD_DIR;
	
	@Value("#{prop.pdf_up_load_file}")
	private String PdfPath;
	
	@Override
	public USFile upFile(MultipartFile file) {
		File parent = new File(IMG_UPLOAD_DIR);
		String uuid =  UUIDUtil.getUUID();
		// 没有文件目录 就创建目录
		if (!parent.exists())
			parent.mkdirs();
		// 生成相关参数
		String oldName = file.getOriginalFilename();			
		String suffix = oldName.substring(oldName.lastIndexOf(".")+1);
		String filename = uuid + "." + suffix;
		try {
			file.transferTo(new File(parent, filename));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String imgUrl = "/api/file/" + filename;   
		USFile usfile = new USFile(filename, imgUrl, uuid);
		return usfile;
	}
	
	
	@Override
	public USFile upPdfFile(MultipartFile file) {
		File parent = new File(PdfPath);
		String uuid =  UUIDUtil.getUUID();
		// 没有文件目录 就创建目录
		if (!parent.exists())
			parent.mkdirs();
		// 生成相关参数
		String oldName = file.getOriginalFilename();			
		String suffix = oldName.substring(oldName.lastIndexOf(".")+1);
		String filename = uuid + "." + suffix;
		try {
			file.transferTo(new File(parent, filename));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String imgUrl = "/api/file/" + filename;   
		USFile usfile = new USFile(filename, imgUrl, uuid);
		return usfile;
	}
	
	@Override
	public String downFile(HttpServletResponse response , String fileName) {
		
		if (fileName != null) {
			File file = new File(IMG_UPLOAD_DIR+"/"+ fileName);
			String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
			String contentType = "image/jpeg";
			if("png".equals(suffix))
				contentType = "image/png";
			else if("bmp".equals(suffix))
				contentType = "image/x-ms-bmp";
			if (file.exists()) {
				response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
				response.setContentType(contentType);
				byte[] buffer = new byte[1024];
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				try {
					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);
					OutputStream os = response.getOutputStream();
					int bytesRead  = 0;
					while ((bytesRead = bis.read(buffer)) != -1) {
						os.write(buffer, 0, bytesRead);					
					}
					os.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (bis != null) {
						try {
							bis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (fis != null) {
						try {
							fis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}

	@Override
	public void DeleteFile(String filename) {
		File parent = new File(IMG_UPLOAD_DIR);
		File file = new File(parent, filename);
		if(file.exists() && file.isFile()){
			file.delete();
		}
	}

	@Override
	public List<USFile> upFile(List<String> imgBase64String) {
		List<USFile> fileList = new ArrayList<USFile>();
		File parent = new File(IMG_UPLOAD_DIR);     
		// 没有文件目录 就创建目录
		if (!parent.exists())
			parent.mkdirs();
		for (int i = 0; i < imgBase64String.size(); i++) {
			String uuid =  UUIDUtil.getUUID();
			// 生成相关参数
			String suffix = "jpg";
			String filename = uuid + "." + suffix;
			//根据图片 读字节流 
			byte[] imgBytes = Base64.decode(imgBase64String.get(i));
			ByteArrayInputStream bais = new ByteArrayInputStream(imgBytes);
	        BufferedImage bi1;
	        try {
				bi1 = ImageIO.read(bais);
				File f1 = new File(IMG_UPLOAD_DIR, filename);
				ImageIO.write(bi1, suffix, f1);
				String imgUrl =  "/api/file/" + filename;
				USFile usfile = new USFile(filename, imgUrl, uuid);
				fileList.add(usfile);
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		return fileList;
	}
}
