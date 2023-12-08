package ${groupId}.common.utils.excel.model;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Excel sheet param.
 *
 * @author Alex Meng
 * @createDate 2022 /12/9
 */
@Getter
@Setter
public class ExcelSheetParam {

    /**
     * sheet 下标，从0开始
     */
    private int index;

    /**
     * sheet 数据类
     */
    private Class<?> clazz;

}
