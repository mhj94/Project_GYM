package com.gym.GYM.company.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Data
@Alias("comment")
public class CommentDTO {

    private int reviewNo;
    private String reviewWriter;
    private String companyCode;
    private String reviewContent;
    private double reviewRate;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date reviewDate;
}
