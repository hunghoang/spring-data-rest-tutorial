package com.standford;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getHelloworld() {
		 return ResponseEntity.ok(new Staff());
	}
}
