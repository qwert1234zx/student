/**
 * The service implements of Province，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.government.statistics.province.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.government.statistics.province.dao.GovStaProvinceMapper;
import universityrecruit.government.statistics.province.entity.Province;
import universityrecruit.government.statistics.province.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GovStaProvinceService")
public class GovStaProvinceServiceImpl extends BaseServiceImpl<Province> implements IProvinceService {

    private GovStaProvinceMapper oProvinceDao;

    @Autowired
    public GovStaProvinceServiceImpl(GovStaProvinceMapper oTempProvinceDao){
        this.oProvinceDao = oTempProvinceDao;
        this.baseDao = oProvinceDao;
    }
}
