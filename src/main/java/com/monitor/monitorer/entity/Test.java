package com.monitor.monitorer.entity;

    import com.monitor.monitorer.entity.base.BaseBean;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author duzj
* @since 2019-05-15
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    public class Test extends BaseBean {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;


}
