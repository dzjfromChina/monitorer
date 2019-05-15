package com.monitor.monitorer.entity;

    import java.io.Serializable;
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
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;


}
