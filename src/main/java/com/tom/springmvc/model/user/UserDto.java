package com.tom.springmvc.model.user;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserDto.java
 * @Description TODO
 * @createTime 2024年10月06日 20:13:00
 */
public class UserDto {

    private Long id;

    private String userName;

    private String city;

    public UserDto() {
        // do nothing.
    }

    public static UserDto build(Long id, String userName, String city) {
        UserDto userDto = new UserDto();
        userDto.id = id;
        userDto.userName = userName;
        userDto.city = city;
        return userDto;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
