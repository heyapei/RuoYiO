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


import com.baomidou.mybatisplus.annotation.EnumValue;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.utils.sql.IEnum;

import java.util.Optional;
import java.util.stream.Stream;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TestEnum implements IEnum {
    //@TODO 请注意修改枚举的名字，修改完成后删除此注释
    /**
    * 代码
    */
    TestEnum_1(0,"代码"),
    /**
    * 音乐
    */
    TestEnum_2(1,"音乐"),
    /**
    * 电影
    */
    TestEnum_3(2,"电影"),
    ;
    @EnumValue
    private int value;
    private String description;

    TestEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @JsonCreator
    public static TestEnum valueOf(Integer value) {
        return Optional.ofNullable(value)
            .flatMap(it -> Stream.of(TestEnum.values())
            .filter(it1 -> it1.value == value)
            .findFirst()).orElse(null);
    }
}