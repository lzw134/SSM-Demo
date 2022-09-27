package com.system.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/27
 */
public class FileUtil {

    /*文件处理类*/
    public static String fileUtils(MultipartFile file) throws Exception {
        // 保存图片的路径，图片上传成功后，将路径保存到数据库
        String filePath = "D://upload";

        // 使用UUID生成全新的文件名称
        String newFileName = UUID.randomUUID().toString().replaceAll("-", "");

        //获取文件扩展名
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());

        // 写入文件夹
        //以绝对路径保存重命名后的图片
        file.transferTo(new File(filePath + "/" + newFileName + "." + ext));

        //返回文件名称类型
        String result = newFileName + "." + ext;

        return result;
    }
}
