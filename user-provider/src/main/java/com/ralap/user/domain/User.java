package com.ralap.user.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * Created by ralap on 2017/11/2.
 */
@Data
public class User implements Serializable {

    private long id;
    private String name;
    private int age;
    private String address;

}
