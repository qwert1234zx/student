package universityrecruit.testfile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import universityrecruit.testfile.entity.Picture;
import universityrecruit.testfile.service.TestFileService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * Created by dc on 2018/10/3.
 */
@Controller
@RequestMapping("/dcc")
public class TestFileController {
    @Autowired
    private TestFileService testFileService;

    @RequestMapping("/filejsp")
    public String filejsp(){
        return "testFile/fileUpload";
    }
    @RequestMapping("/tobyid")
    public String tobyid(){
        return "testFile/selectbyid";
    }

    @RequestMapping("/fileUpload")
    @Transactional
    public String fileUpload(@RequestParam("name") String name,
                             @RequestParam("uploadfile") List<MultipartFile> uploadfile,
                             HttpServletRequest request,Model model){
        System.out.println("上传人"+name);
        for (MultipartFile file : uploadfile) {
            // 获取上传文件的原始名称
            String originalFilename = file.getOriginalFilename();
            System.out.println("1:"+originalFilename);
            // 设置上传文件的保存地址目录
            String dirPath =request.getRealPath("/upload/");
            System.out.println("2:"+dirPath);
            File filePath = new File(dirPath);
            // 如果保存文件的地址不存在，就先创建目录
            if (!filePath.exists()) {
                filePath.mkdirs();
            }
            // 使用UUID重新命名上传的文件名称(上传人_uuid_原始文件名称)
            String newFilename = name+ "_"+ UUID.randomUUID() +
                    "_"+originalFilename;
            System.out.println("3:"+dirPath+newFilename);
            try {
                // 使用MultipartFile接口的方法完成文件上传到指定位置
                file.transferTo(new File(dirPath + newFilename));
            } catch (Exception e) {
                e.printStackTrace();
                return"error";
            }
            Picture picture=new Picture();
            picture.setName(name);
            picture.setAddress(newFilename);
            testFileService.addfile(picture);
            model.addAttribute("information",picture);
        }
        return "testFile/filesuccUploadajax";
    }
    @RequestMapping("/selectfile")
    @ResponseBody
    public Picture selectfile(Integer picid,Model model){
        Picture picture1=testFileService.selectfile(picid);
        picture1.setAddress("/upload/"+picture1.getAddress());
        System.out.println(picture1.getAddress());
        return picture1;
    }
}
