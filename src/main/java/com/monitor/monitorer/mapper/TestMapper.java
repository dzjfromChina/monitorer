package com.monitor.monitorer.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.monitor.monitorer.entity.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author duzj
 * @since 2019-05-15
 */
@Repository
public interface TestMapper extends BaseMapper<Test> {

    /**
     * 分页 demo
     * @param page
     * @param state
     * @return
     */
    IPage<Test> mySelectPage(Page page, @Param("age") Integer state);

}
