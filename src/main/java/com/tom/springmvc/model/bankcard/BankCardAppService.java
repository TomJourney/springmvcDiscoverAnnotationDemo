package com.tom.springmvc.model.bankcard;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BankCardAppService.java
 * @Description TODO
 * @createTime 2024年09月22日 14:30:00
 */
@Service
public class BankCardAppService {
    public List<BankCardDto> listCard() {
        // 这里本应该调用dao层或http，为简单期间，我们在内存mock一个list
        return List.of(
                BankCardDto.build(1L, "62140001", "银行卡备注1")
                , BankCardDto.build(2L, "62140002", "银行卡备注2")
                , BankCardDto.build(3L, "62140003", "银行卡备注3")
                , BankCardDto.build(4L, "62140004", "银行卡备注4")
        );
    }
}
