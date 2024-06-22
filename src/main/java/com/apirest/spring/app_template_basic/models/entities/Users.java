package com.apirest.spring.app_template_basic.models.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
//@Data = (@ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor)
// 50% falta la persistencia ejem:  jkarta
public class Users implements Serializable{
    private Integer id;
    private String name;
    private String lastname;
    private Double height;
    private Date date_register;
    // private List<Product> productList = new ArrayList<>();
}