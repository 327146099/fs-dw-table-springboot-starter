package cn.bdmcom;

import cn.bdmcom.core.domain.FsDwTable;
import cn.bdmcom.core.domain.FsDwTableId;
import cn.bdmcom.core.domain.FsDwTableProperty;
import cn.bdmcom.core.domain.TypeEnum;
import lombok.Data;

@Data
@FsDwTable(name = "Test Table111", tableId = "tblXvocZzO66baLU", viewId = "vew1ycV3CI")
public class TestTable extends DemoAppBase {

    @FsDwTableId
    private String recordId;

    @FsDwTableProperty(value = "名称", order = 1, type = TypeEnum.TEXT)
    private String name;

    @FsDwTableProperty(value = "年龄", order = 2, type = TypeEnum.NUMBER)
    private Integer age;
}
