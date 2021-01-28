package org.abc.reCaptcha.validator;

import org.abc.reCaptcha.entity.ReCaptchaResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CaptchaValidator {

	@Autowired
	private RestTemplate rt;
	
	@Value("${serverSide.Captchakey}")
	private String serverSideCaptchakey;

	public boolean isValid(String captcha) {
		String url="https://www.google.com/recaptcha/api/siteverify";
		String params="?secret="+serverSideCaptchakey
				+ "&response="+captcha;
		ReCaptchaResponseType resp = rt.postForObject(
				url+params, null, 
				ReCaptchaResponseType.class);
		return resp.isSuccess();
	}
}