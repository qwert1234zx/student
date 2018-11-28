package universityrecruit.student.statistics.impl;

import universityrecruit.student.statistics.dao.newStudentInfoDao;
import universityrecruit.student.statistics.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NewStudentInfoServiceImpl implements NewStudentInfoService {
    @Autowired
    private newStudentInfoDao studentInfoDao;

    public List<sorceResult> getAllStudent() {
        return studentInfoDao.getAllStudent();
    }

}