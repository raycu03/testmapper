package com.mapper.testmapper.mapperTest;

import com.mapper.testmapper.controller.Perro;
import com.mapper.testmapper.controller.PerroDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperTest {

  Perro toEntity(PerroDto perroDto);

  PerroDto toRest(Perro perro);

}
