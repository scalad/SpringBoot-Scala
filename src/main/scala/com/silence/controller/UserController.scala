package com.silence.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.beans.factory.annotation.Autowired
import com.silence.repository.UserRepository
import org.springframework.web.servlet.ModelAndView
import com.silence.enties.User
import java.util.List
import org.springframework.web.bind.annotation.PathVariable
import javax.validation.Valid
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Page
import com.silence.service.UserService

@ComponentScan
@Controller
@ResponseBody
class UserController @Autowired()(private val userService : UserService){
  
	@RequestMapping(value = Array("/list"), method = Array(RequestMethod.GET))
  def list() : List[User] = {
      userService.findAll
  }
  
  @RequestMapping(value = Array("save"), method = Array(RequestMethod.POST))
  def save(@Valid user : User) : User = {
      userService.save(user)
  }
  
	@RequestMapping(value = Array("/find/{id}"), method = Array(RequestMethod.GET))
  def find(@PathVariable(value = "id") id: Long) : User = {
      userService.find(id)
  }
  
  @RequestMapping(value = Array("delete/{id}"), method = Array(RequestMethod.POST))
  def delete(@PathVariable(value = "id") id: Long) : Unit = {
      userService.delete(id)
  }
  
  @RequestMapping(value = Array("update"), method = Array(RequestMethod.POST))
  def update(@Valid user : User, bindingResult : BindingResult) : User = {
      userService.update(user)
  }
  
  @RequestMapping(value = Array("page"), method = Array(RequestMethod.GET))
  def page(@RequestParam("page") page : Int, @RequestParam("pageSize") pageSize : Int) : Page[User] = {
      userService.page(page, pageSize)
  }
  
}