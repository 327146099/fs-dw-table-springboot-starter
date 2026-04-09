package cn.bdmcom;

import cn.bdmcom.core.service.FsDwTableService;
import cn.bdmcom.core.service.FsDwRecordService;
import cn.bdmcom.core.service.FsDwFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 飞书多维表格测试控制器
 */
@RestController
@RequestMapping("/api/fs-dw")
public class FsDwTestController {

    @Autowired
    private FsDwTableService fsDwTableService;

    @Autowired
    private FsDwRecordService fsDwRecordService;

    @Autowired
    private FsDwFieldService fsDwFieldService;


}
