/**
 * The service implements of Province，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.statistics.province.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.statistics.province.dao.EntStaProvinceMapper;
import universityrecruit.enterprise.statistics.province.entity.Province;
import universityrecruit.enterprise.statistics.province.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStaProvinceService")
public class EntStaProvinceServiceImpl extends BaseServiceImpl<Province> implements IProvinceService {

    private EntStaProvinceMapper oProvinceDao;

    @Autowired
    public EntStaProvinceServiceImpl(EntStaProvinceMapper oTempProvinceDao){
        this.oProvinceDao = oTempProvinceDao;
        this.baseDao = oProvinceDao;
    }
}
