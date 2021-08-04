/* ***************************************
 *                                       *
 *  @dookay.com Internet make it happen  *
 *  ----------- -----------------------  *
 *  dddd  ddddd Internet make it happen  *
 *  o   o     o Internet make it happen  *
 *  k    k    k Internet make it happen  *
 *  a   a     a Internet make it happen  *
 *  yyyy  yyyyy Internet make it happen  *
 *  ----------- -----------------------  *
 *  NO BUG ENJOY LIFE                    *
 *                                       *
 ****************************************/
package com.ruoyi.common.testgenerator;

import com.dookay.coral.bulider.core.front.Bind;
import com.dookay.coral.bulider.core.front.FormItem;
import com.dookay.coral.bulider.core.front.FormItemType;
import lombok.Data;

import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.Date;

/**
 * 夏越价格表单
 *
 * @author hz
 * @version V1.0
 * @since 2021年08月04日
 */
@Data
public class DayPriceForm implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @Bind(title = "编号")
    @FormItem(type = FormItemType.NUMBER)
    private Long id;

    /**
     * 学生名称
     */
    @Bind(title = "学生名称")
    @FormItem(type = FormItemType.INPUT)
    @Max(value = 30, message = "超出长度限制")
    private String studentName;

    /**
     * 年龄
     */
    @Bind(title = "年龄")
    @FormItem(type = FormItemType.NUMBER)
    private Integer studentAge;

    /**
     * 爱好{0:代码,1:音乐,2:电影}
     */
    @Bind(title = "爱好{0:代码,1:音乐,2:电影}")
    @FormItem(type = FormItemType.INPUT)
    @Max(value = 30, message = "超出长度限制")
    private String studentHobby;

    /**
     * 性别（0男 1女 2未知）
     */
    @Bind(title = "性别（0男 1女 2未知）")
    @FormItem(type = FormItemType.INPUT)
    @Max(value = 1, message = "超出长度限制")
    private String studentSex;

    /**
     * 状态（0正常 1停用）
     */
    @Bind(title = "状态（0正常 1停用）")
    @FormItem(type = FormItemType.INPUT)
    @Max(value = 1, message = "超出长度限制")
    private String studentStatus;

    /**
     * 生日
     */
    @Bind(title = "生日")
    @FormItem(type = FormItemType.DATE)
    private Date studentBirthday;

    /**
     * 爱好测试{0:代码,1:音乐,2:电影}
     */
    @Bind(title = "爱好测试")
    @FormItem(type = FormItemType.SELECT)
    private Integer testEnum;


}
