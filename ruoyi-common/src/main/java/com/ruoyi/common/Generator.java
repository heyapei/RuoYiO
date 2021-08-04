package com.ruoyi.common;


import com.dookay.coral.bulider.utils.CoreUtils;


/**
 * 基于稻壳的mybatis-plus代码生成器
 *
 * @author hz
 * @version 1.0.0
 * @date 2021/08/04
 * @since 1.0.0
 */
public class Generator {

    public static void main(final String[] args) throws Exception {
        CoreUtils.generate("/generator.xml");

        /**
         * 使用方式：
         * 1. 使用当前单独引入到项目的jar包
         * 2. 在项目pom文件中添加如下配置
         *      <!--为了解决稻壳的问题-->
         *         <dependency>
         *             <groupId>org.dom4j</groupId>
         *             <artifactId>dom4j</artifactId>
         *             <version>2.0.0</version>
         *         </dependency>
         *         <dependency>
         *             <groupId>mysql</groupId>
         *             <artifactId>mysql-connector-java</artifactId>
         *             <version>5.1.17</version>
         *         </dependency>
         *         <dependency>
         *             <groupId>org.freemarker</groupId>
         *             <artifactId>freemarker</artifactId>
         *         </dependency>
         * 3. 需要的表的主键必须是 id （否则会没有主键异常）不允许更改为其他的 如果需要更改可以先使用id创建，等创建完成再进行修改
         * 4. 如果有要生成枚举类数据，则枚举类的数据库类型必须是tinyint
         * 5. 生成完成后需要修改大部分内容 这里参考testgenerator就可以了 还有比较标准的sysStudent这部分代码
         * 6. 大部分都可以需要参考ruoyi自身的代码生成系统
         */
    }
}
