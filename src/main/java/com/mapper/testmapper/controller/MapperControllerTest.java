package com.mapper.testmapper.controller;


import com.mapper.testmapper.mapperTest.MapperTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MapperControllerTest {


private MapperTest mapperTest;

  @GetMapping()
  public String getAccesToken() {
    Perro perro = mapperTest.toEntity(new PerroDto(1,"sds"));
    return "hola";
  }
}
