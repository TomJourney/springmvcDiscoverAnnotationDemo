package com.tom.springmvc.model.bankcard;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BankCardDto.java
 * @Description TODO
 * @createTime 2024年09月22日 14:30:00
 */
public class BankCardDto {

    private Long id;

    private String cardNo;

    private String remark;

    public static BankCardDto build(Long id, String cardNo, String remark) {
        BankCardDto bankCardDto = new BankCardDto();
        bankCardDto.id = id;
        bankCardDto.cardNo = cardNo;
        bankCardDto.remark = remark;
        return bankCardDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
