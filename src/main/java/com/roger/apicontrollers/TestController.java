package com.roger.apicontrollers;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	
	@RequestMapping(method=RequestMethod.POST, value="/restapi",produces="text/josn;charset=UTF-8")
	public String testUpload(@RequestBody byte [] file,@RequestHeader HttpHeaders headers){
		System.out.println(headers.containsKey("file"));
		List<String > fileList=headers.get("file");
		for(String s : fileList)
		{
			System.out.println(s);
		}
		return "{\"test\":\"cccc\"}";
	}

}
