package com.system.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/27
 */
public class FileUtil {

    /*文件处理类*/
    public static String fileUtils(HttpServletRequest request,MultipartFile file) throws Exception {
        // 保存图片的路径，图片上传成功后，将路径保存到数据库
        String filePath = "D://upload";

        // 使用UUID生成全新的文件名称
        String newFileName = UUID.randomUUID().toString().replaceAll("-", "");

        //获取文件扩展名
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());

        //返回文件名称+文件类型
        String FileName = newFileName + "." + ext;

        //当前项目路径（存储图片的文件夹）
        String path = request.getSession().getServletContext().getRealPath("/files");
        File fileUrl=new File(path);

        //如果当前项目里不存在images文件夹，就创建
        if(!fileUrl.exists()){
            fileUrl.mkdir();
        }

        // 写入文件夹
        //file.transferTo(new File(filePath + "/" + newFileName + "." + ext));
        file.transferTo(new File(request.getServletContext().getRealPath("/files") + "/" +FileName));


        return FileName;
    }
}
