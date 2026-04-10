package cn.bdmcom;

import cn.bdmcom.annotation.EnableFsDwTable;
import cn.bdmcom.core.helper.FsDwRecordHelper;
import cn.bdmcom.core.service.FsDwTableService;
import cn.hutool.core.util.IdUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootApplication
@RunWith(SpringRunner.class)
@EnableFsDwTable
@SpringBootTest(classes = FsDwTestApplication.class)
public class FsDwTestApplication {

    @Autowired
    private FsDwTableService fsDwTableService;

    @Test
    public void test(){

        TestTable testTable = new TestTable();
        testTable.setRecordId(IdUtil.fastSimpleUUID());
        testTable.setName("李四");
        testTable.setAge(18);
        FsDwRecordHelper.addRecord(testTable);
//        List<TestTable> records = FsDwRecordHelper.queryRecords(TestTable.class);
//        System.out.println(records);
//        TestTable testTable1 = records.get(1);
//        testTable1.setName("王五");
//        testTable1.setAge(123213);
//        FsDwRecordHelper.updateRecord(testTable1);




    }

}
