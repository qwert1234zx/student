/**
 * The service implements of FeeRecord，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.feemanagement.feerecord.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.feemanagement.feerecord.dao.EntFeeFeeRecordMapper;
import universityrecruit.enterprise.feemanagement.feerecord.entity.FeeRecord;
import universityrecruit.enterprise.feemanagement.feerecord.service.IFeeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntFeeFeeRecordService")
public class EntFeeFeeRecordServiceImpl extends BaseServiceImpl<FeeRecord> implements IFeeRecordService {

    private EntFeeFeeRecordMapper oFeeRecordDao;

    @Autowired
    public EntFeeFeeRecordServiceImpl(EntFeeFeeRecordMapper oTempFeeRecordDao){
        this.oFeeRecordDao = oTempFeeRecordDao;
        this.baseDao = oFeeRecordDao;
    }
}
