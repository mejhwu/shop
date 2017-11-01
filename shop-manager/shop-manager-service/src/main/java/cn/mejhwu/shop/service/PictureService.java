package cn.mejhwu.shop.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: mejhwu
 * Date:   17-10-30
 * E-mail: mejhwu@163.com
 * Description:
 */

public interface PictureService {

    Map uplaodPicture(MultipartFile uploadFile);

}
