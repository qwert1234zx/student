/**
 * The service implements of Province，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.statistics.province.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.statistics.province.dao.UniStaProvinceMapper;
import universityrecruit.university.statistics.province.entity.Province;
import universityrecruit.university.statistics.province.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStaProvinceService")
public class UniStaProvinceServiceImpl extends BaseServiceImpl<Province> implements IProvinceService {

    private UniStaProvinceMapper oProvinceDao;

    @Autowired
    public UniStaProvinceServiceImpl(UniStaProvinceMapper oTempProvinceDao){
        this.oProvinceDao = oTempProvinceDao;
        this.baseDao = oProvinceDao;
    }
}
