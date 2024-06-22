package com.apirest.spring.app_template_basic.models.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data //@ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor
@Builder
public class UserDto  implements Serializable {
    private String name;
    private String lastname;
    private Double height;
    private Date date_register;
    private Date date_update;
}

//▶️ user-create-dto, user-list-dto ... multiple fields