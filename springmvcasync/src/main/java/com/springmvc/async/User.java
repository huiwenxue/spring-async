package com.springmvc.async;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -731976207679351696L;
    private Integer age;
	private String height;
}
