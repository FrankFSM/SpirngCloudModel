package com.ralap.payment.mapper;

import com.ralap.payment.domain.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by ralap on 2017/11/3.
 */
@Mapper
public interface PaymentMapper {

    @Select("select * from payment where id = #{id}")
    public Payment getPaymentById(@PathVariable long id);
}
