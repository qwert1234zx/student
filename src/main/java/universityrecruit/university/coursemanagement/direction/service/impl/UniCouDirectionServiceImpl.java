/**
 * The service implements of Direction，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.coursemanagement.direction.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.coursemanagement.direction.dao.UniCouDirectionMapper;
import universityrecruit.university.coursemanagement.direction.entity.Direction;
import universityrecruit.university.coursemanagement.direction.service.IDirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniCouDirectionService")
public class UniCouDirectionServiceImpl extends BaseServiceImpl<Direction> implements IDirectionService {

    private UniCouDirectionMapper oDirectionDao;

    @Autowired
    public UniCouDirectionServiceImpl(UniCouDirectionMapper oTempDirectionDao){
        this.oDirectionDao = oTempDirectionDao;
        this.baseDao = oDirectionDao;
    }
}
