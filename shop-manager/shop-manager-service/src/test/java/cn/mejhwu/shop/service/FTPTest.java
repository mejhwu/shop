package cn.mejhwu.shop.service;

import cn.mejhwu.shop.util.FtpUtil;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Author: mejhwu
 * Date:   17-11-1
 * E-mail: mejhwu@163.com
 * Description:
 */

public class FTPTest {

    @Test
    public void testFtpUpload () throws IOException {
        FileInputStream inputStream = new FileInputStream("/home/mejhwu/Pictures/sy_79896567561.jpg");

        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("192.168.1.201", 21);
        ftpClient.login("ftpuser", "ftpuser");
        ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        ftpClient.storeFile("hello2.jpg", inputStream);
        ftpClient.logout();

    }

}
