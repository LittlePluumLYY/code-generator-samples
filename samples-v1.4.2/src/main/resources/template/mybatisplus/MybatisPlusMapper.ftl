package ${javaClassDefinition.MAPPER.fullPackage};


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ${javaClassDefinition.POJO.fullPackage}.${javaClassDefinition.POJO.className};
import org.apache.ibatis.annotations.Mapper;

/**
 * ${tableInfo.tableComment} Mapper
 * time:    ${classCommentInfo.createTime} <br/>
 * @author  ${classCommentInfo.author} <br/>
 * @since   ${classCommentInfo.sinceVersion} <br/>
 */
@Mapper
public interface ${javaClassDefinition.MAPPER.className} extends BaseMapper<${javaClassDefinition.POJO.className}> {

}