package universityrecruit.student.statistics.impl;

import universityrecruit.student.statistics.dao.studenttjdao;
import universityrecruit.student.statistics.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sw on 2018/9/15.
 */
@Service
public class studenttjservicelmpl implements studenttjservice {
    @Autowired
    private studenttjdao studenttjdao;

    public List<sorceResult1> getAllqy() {
        return studenttjdao.getAllqy();
    }
}
