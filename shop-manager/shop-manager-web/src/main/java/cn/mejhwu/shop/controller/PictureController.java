package cn.mejhwu.shop.controller;

import cn.mejhwu.shop.service.PictureService;
import com.alibaba.druid.support.json.JSONUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: mejhwu
 * Date:   17-11-1
 * E-mail: mejhwu@163.com
 * Description:
 */

@Controller
@RequestMapping("/pic")
public class PictureController {

    @Autowired
    PictureService pictureService;

    @RequestMapping(path="/upload", method= RequestMethod.POST)
    @ResponseBody
    public String pictureUpload(MultipartFile uploadFile) {
        Map result = pictureService.uplaodPicture(uploadFile);
        String json = JSONUtils.toJSONString(result);
        return json;
    }

}
