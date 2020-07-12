package com.github.zhuyizhuo.generator.samples;

import com.github.zhuyizhuo.generator.mybatis.generator.Generator;
import com.github.zhuyizhuo.generator.mybatis.generator.GeneratorBuilder;

/**
 * 简单的生成器使用 sample
 * @author zhuo
 */
public class SimpleDemo {

    public static void main(String[] args) {
        Generator generator = new GeneratorBuilder()
                .properties("generate.table-names=sample_user",
                        "generate.java.module.mapper.package=com.github.generator.management.repository",
                        "generate.java.module.model.package=com.github.generator.management.repository.model",
                        "generate.resources.xml.out-put-path=/src/main/resources/customize/xml"
                        )
                .build("config.properties");
        generator.generate();
    }
}
