package com.springmvc.async;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer age;
	private String height;
}
