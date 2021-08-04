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

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dookay.coral.bulider.core.front.Bind;
import com.dookay.coral.bulider.core.front.ColumnFormat;
import com.dookay.coral.bulider.core.front.impl.DateFormat;
import com.dookay.coral.bulider.core.front.impl.EnumTextFormat;
import lombok.Data;


import java.io.Serializable;
import java.util.Date;

/**
 * 夏越价格
 *
 * @author hz
 * @version V1.0
 * @since 2021年08月04日
 */
@Data
public class DayPriceDomain implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @Bind(title = "编号")
    @TableId
    private Long id;

    /**
     * 学生名称
     */
    @Bind(title = "学生名称")
    private String studentName;

    /**
     * 年龄
     */
    @Bind(title = "年龄")
    private Integer studentAge;

    /**
     * 爱好{0:代码,1:音乐,2:电影}
     */
    @Bind(title = "爱好{0:代码,1:音乐,2:电影}")
    private String studentHobby;

    /**
     * 性别（0男 1女 2未知）
     */
    @Bind(title = "性别（0男 1女 2未知）")
    private String studentSex;

    /**
     * 状态（0正常 1停用）
     */
    @Bind(title = "状态（0正常 1停用）")
    private String studentStatus;

    /**
     * 生日
     */
    @Bind(title = "生日")
    @ColumnFormat(value = "YYYY-MM-DD", format = DateFormat.class)
    private Date studentBirthday;

    /**
     * 爱好测试{0:代码,1:音乐,2:电影}
     */
    @Bind(title = "爱好测试")
    @ColumnFormat(value = "{0:代码,1:音乐,2:电影}", format = EnumTextFormat.class)
    private TestEnum testEnum;


}
