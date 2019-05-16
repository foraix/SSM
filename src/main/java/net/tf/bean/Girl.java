package net.tf.bean;

import lombok.*;

import java.sql.DatabaseMetaData;
import java.util.Date;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/5/16 18:07
 * @desc
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Girl {
    private Integer id;
    private String name;
    private String flower;
    private Date birth;

    public Girl(String name, String flower, Date birth) {
        this.name = name;
        this.flower = flower;
        this.birth = birth;
    }
}
