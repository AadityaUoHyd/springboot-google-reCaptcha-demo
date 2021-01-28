package org.abc.reCaptcha.entity;

import lombok.Data;

@Data
public class ReCaptchaResponseType {

	private boolean success;
	private String challenge_ts;
	private String hostname;
}