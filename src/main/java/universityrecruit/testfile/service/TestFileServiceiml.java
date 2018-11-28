package universityrecruit.testfile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import universityrecruit.testfile.dao.TestFileDao;
import universityrecruit.testfile.entity.Picture;

/**
 * Created by dc on 2018/10/3.
 */
@Service

public class TestFileServiceiml implements TestFileService{
    @Autowired
    private TestFileDao testFileDao;
    public Integer addfile(Picture picture){
        Integer result=this.testFileDao.addfile(picture);
//        System.out.println(100/0);
        return result;
    }
    public Picture selectfile(Integer uid){
        return this.testFileDao.selectfile(uid);
    }
}
