package com.silence.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.ResponseBody

@ComponentScan
@Controller
class UserController {
  
  @ResponseBody
	@RequestMapping(value = Array("/index"), method = Array(RequestMethod.GET))
  def list(str : String) = {
	  print("hello world")
    "index"
  }
  
}