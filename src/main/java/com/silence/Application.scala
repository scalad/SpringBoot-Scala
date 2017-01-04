package com.silence

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@ComponentScan
@Controller
class Application {
  
	@RequestMapping(Array("/index"))
  @RequestMapping(method = Array(RequestMethod.GET))
  def list(str : String) = {
    "index"
  }
  
}