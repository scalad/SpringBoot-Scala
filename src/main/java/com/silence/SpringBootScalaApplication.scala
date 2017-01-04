package com.silence

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.CommandLineRunner

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
object WebApplication extends App{

		  SpringApplication.run(classOf[SpringbootScalaApplication], args: _*)
  
}

@EnableAutoConfiguration
class SpringbootScalaApplication extends CommandLineRunner {
  
  override def run(strings: String*): Unit = {
      println("springboot -scala 启动");
  }
  
}