/**  
* @Title: HTTPUtils.java  
* @Package com.uspring.sdsMaintenance.utils  
* @Description: TODO(用一句话描述该文件做什么)  
* @author zhanghuajie@uspring.cn
* @date 2019年1月14日  
* @version V1.0  
*/  

package com.uspring.sdsmesplus.barcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

import com.uspring.sdsmesplus.exception.ServiceException;


/** 
 * @ClassName: HTTPUtils
 * @Description: 
 * @author zhanghuajie zhanghuajie@uspring.cn 
 * @date 2019年1月14日  下午2:25:40
 *  
 */

public class HTTPUtils {
	 
	private final static String DEFAULT_ENCODING = "UTF-8";
	 /** 
	* @Title: SendPost 
	* @Description:  发送POST请求，参数以x-www-form-urlencoded形式提交
	* @param url
	* @param parmas
	* @return  返回值说明
	*/
	public static String SendPost(String url,Map<String, Object> parmas) {
		 
	        PrintWriter out = null;
	        BufferedReader in = null;
	        String result = "";
	        String postBody = "";
	        
	        try {
	        	URL ourl = new URL(url);
	            // 打开和URL之间的连接
	            URLConnection conn = ourl.openConnection();
	            // 设置通用的请求属性
	            conn.setRequestProperty("accept", "*/*");
	            conn.setRequestProperty("accept", "*/*");
	            conn.setRequestProperty("connection", "Keep-Alive");
	            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
	            
	            // 发送POST请求必须设置如下两行
//	            conn.setDoOutput(true);
//	            conn.setDoInput(true);
	            // 获取URLConnection对象对应的输出流
	            out = new PrintWriter(conn.getOutputStream());
	            // 发送请求参数
	            StringBuffer sb = new StringBuffer();
	            int i=0;
	            for (Entry<String, Object> entry : parmas.entrySet()) { 
	            	if(i==0){
	            		sb.append(entry.getKey() +"=" + URLEncoder.encode(""+entry.getValue(), "utf-8"));
	            	}else {
	            		sb.append("&"+entry.getKey() +"=" + URLEncoder.encode(""+entry.getValue(), "utf-8"));
					}
	            	i++;
	            }
	            postBody = sb.toString();
	            out.print(postBody);
	            // flush输出流的缓冲
	            out.flush();
	            // 定义BufferedReader输入流来读取URL的响应
	            InputStream xx = conn.getInputStream();
	            in = new BufferedReader(new InputStreamReader(xx,DEFAULT_ENCODING));
	            String line;
	            while ((line = in.readLine()) != null) {
	                result += line;
	            }
	        } catch (Exception e) {
	            throw new ServiceException("HTTP接口异常", e);
	        }
	        // 使用finally块来关闭输出流、输入流
	        finally {
	            try {
	                if (out != null) {
	                    out.close();
	                }
	                if (in != null) {
	                    in.close();
	                }
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	        return result;
	    }
}
