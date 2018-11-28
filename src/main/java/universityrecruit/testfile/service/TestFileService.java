package universityrecruit.testfile.service;

import universityrecruit.testfile.entity.Picture;

/**
 * Created by dc on 2018/10/3.
 */
public interface TestFileService {
    public Integer addfile(Picture picture);
    public Picture selectfile(Integer uid);
}
