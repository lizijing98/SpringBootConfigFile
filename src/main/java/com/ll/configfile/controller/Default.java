package com.ll.configfile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 默认 Controller
 *
 * @author LiZijing
 * @date 2022/1/27
 */
@RestController
@RequestMapping("/")
public class Default {
  @Value("${config.name}")
  private String name;

  @RequestMapping(
      value = "/",
      method = {RequestMethod.GET})
  public String getName() {
    return this.name;
  }
}
