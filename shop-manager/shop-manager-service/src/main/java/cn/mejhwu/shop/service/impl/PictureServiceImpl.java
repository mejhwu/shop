package cn.mejhwu.shop.service.impl;

import cn.mejhwu.shop.service.PictureService;
import cn.mejhwu.shop.util.FtpUtil;
import cn.mejhwu.shop.util.IDUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: mejhwu
 * Date:   17-10-30
 * E-mail: mejhwu@163.com
 * Description: 图片上传服务
 */

@Service
public class PictureServiceImpl implements PictureService {

    @Value("${ftp.address}")
    String ftpAddress;
    @Value("${ftp.port}")
    Integer ftpPort;
    @Value("${ftp.username}")
    String ftpUsername;
    @Value("${ftp.password}")
    String fptPassword;
    @Value("${images.server.address}")
    String imagesServerAddress;
    @Value("${ftp.basepath}")
    String ftpBasepath;
    @Value("${images.server.basepath}")
    String imagesServerBasepath;

    @Override
    public Map uplaodPicture(MultipartFile uploadFile) {
        Map resultMap = new HashMap();
        try {

            InputStream inputStream = uploadFile.getInputStream();

            String oldFileName = uploadFile.getOriginalFilename();
            //生成新的文件名
            String newFileName = IDUtils.genImageName() + oldFileName.substring(oldFileName.lastIndexOf("."));

            String filepath = new DateTime().toString("/yyyy/MM/dd");

            boolean result = FtpUtil.uploadFile(ftpAddress, ftpPort, ftpUsername, fptPassword,
                    ftpBasepath, filepath, newFileName, inputStream);


            if (!result) {
                resultMap.put("error", 1);
                resultMap.put("message", "文件上传失败");
                return resultMap;
            }

            resultMap.put("error", 0);
            resultMap.put("url", imagesServerAddress + imagesServerBasepath +
                                filepath + "/" + newFileName);
            return resultMap;

        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("error", 1);
            resultMap.put("message", "文件上传异常");
            return resultMap;
        }
    }
}
